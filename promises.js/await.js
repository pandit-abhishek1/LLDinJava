const timeoutFunc = (data, count, delay) => {
  console.log(
    `Starting timeout with data: ${data} for ${delay}ms and count: ${count}`
  );
  setTimeout(() => {
    console.log(`Timeout of ${count}ms started`);
    for(let i=0;i< 9;i++){
        count += 1;
    } // Simulate a blocking operation
    console.log(`Timeout completed with data: ${count}`);
  }, delay);
  console.log(`timeoutFunc returning ${count}`);
  return new Promise((resolve, reject) => {
        setTimeout(() => {
    console.log(`Promise Timeout of ${count}ms started`);
    for(let i=0;i< 9;i++){
        count += 1;
    } // Simulate a blocking operation
    console.log(`Promise Timeout completed with data: ${count}`);
  }, delay);

    if (data) {
      resolve( 7); // fulfilled
    } else {
      reject(11); // rejected
    }
  });
};

const awaitfunc1 = async (data, count) => {
  console.log("awaitfunc1 called with data:", data, count);
  setTimeout(() => {
    console.log(`Timeout of ${count}ms started`);
    for(let i=0;i< 9;i++){
        count += 1;
    } // Simulate a blocking operation
    console.log(`Timeout completed with data: ${count}`);
  }, 1000);
  count += 1;
  const promise = new Promise((resolve, reject) => {
    if (data) {
      resolve(3); // fulfilled
    } else {
      reject(5); // rejected
    }
  });
  return promise;
};
const awaitfunc2 = async (data, count) => {
  try {
    console.log("awaitfunc2 called with data:", data, count);
    console.log("awaitfunc2 before", count);
    const result = await awaitfunc1(data, count);
    console.log("Result2:", result);
    console.log("awaitfunc2 after", count);
    console.log("timeoutbefore", count);
     const timeoutResult = await timeoutFunc(data, result, 1000);
    console.log("Timeout Result:", timeoutResult);
    console.log("timeoutafter", count);
    return new Promise((resolve, reject) => {
      if (!data) {
        resolve(result * 3); // fulfilled
      } else {
        reject(result * 5); // rejected
      }
    });
  } catch (error) {
    console.log("Error2:", error);
    try {
      const timeoutResult = await timeoutFunc(data, error, 1000);
      console.log("timeoutbefore");
      console.log("Timeout Result:", timeoutResult);
      console.log("timeoutafter");
    } catch (error) {
      console.log("Timeout Result:", error);
    }

    return new Promise((resolve, reject) => {
      if (data) {
        resolve(error * 3); // fulfilled
      } else {
        reject(error * 5); // rejected
      }
    });
  }
};
const awaitfunc3 = async (data, count) => {
  try {
    const result = await awaitfunc2(data, count);
    console.log("Result3:", result, count);
    return result * 10;
  } catch (error) {
    console.log("Error3:", error, count);
    throw error * 100;
  }
};

const awaitfunc4 = async (data, count) => {
  try {
    const result = await awaitfunc3(data, count);
    console.log("Result4:", result, count);
  } catch (error) {
    console.log("Error4:", error, count);
  }
};
awaitfunc4(1, 1);
