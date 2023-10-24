def call(){
    sh "docker run -d --name youtube2 -p 3001:3001 sevenajay/youtube:latest"
}
