// Example usage
const data = 0; // Change to false to see the rejection case
const promise = new Promise((resolve, reject) => {
    if (data) {
        resolve(5);
    } else {
        reject(4);
    }
});
promise.then((message) => {
    console.log("then",message);
    return message * 5;
})
.then((newMessage) => {
    console.log("then",newMessage);
    return newMessage * 5;
})
.then((finalMessage) => {
    console.log("then",finalMessage);
    return new Promise((resolve, reject) => {
        if (!data) {
            resolve(finalMessage * 5);
        }
        else {
            reject(finalMessage * 4);
        }
    });
})
.catch((msg) => {
    console.log("catch ",msg);
    return new Promise((resolve, reject) => {
        if (data) {
            resolve(msg * 5);
        }
        else {
            reject(msg * 4);
        }
    });

}).catch((msg) => {
    console.log("catch ",msg);
    // Handle the error
    return msg * 4;
})
.then((newMsg) => {
    console.log("then",newMsg);
    return newMsg * 4;
}
).then((finalMsg) => {
    console.log("then",finalMsg);
    return finalMsg * 4;
}
).catch((err) => {
    console.log("catch",err);
    return err * 4;
})
.then((finalMsg) => {
    console.log("then",finalMsg);
    return finalMsg * 4;
})
.finally(() => {
    console.log('This will always execute regardless of the promise outcome.');
});