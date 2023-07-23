def call(Map config = [:]) {
    sh 'mvn clean package'
    sh 'mv target/*.jar target/app.jar'
}
