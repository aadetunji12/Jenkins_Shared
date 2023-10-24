def call(){
    sh 'docker stop youtube3'
    sh 'docker rm youtube3'
}
