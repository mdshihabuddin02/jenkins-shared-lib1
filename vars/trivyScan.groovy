def call(Map config = [:]) {
    sh "sudo ${config.path} image ${config.image}:${config.tag}"
}
