def call(Map config = [:]) {
     if (config.type == 'all') {
          sh """
               docker stop $(docker ps -q)
               docker rmi -f $(docker images -q)
               docker system prune -f

               """
     }
     else if (config.type == 'customPreference') {
          sh"scripts/dockercleanup"
     }
     else {
          sh"docker rmi -f ${config.type}"
     }
}
