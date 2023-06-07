def call(){
    sh '''
    mvn clean install
    mvn test
   '''
}
