import { log } from "console"
import http from "http"

let cnt = 0;

http.createServer((req, res) => {
    if (req.url == "/") {
        cnt += 1;
        console.log(cnt);

    }
    res.end("from server") 
}).listen(80) 