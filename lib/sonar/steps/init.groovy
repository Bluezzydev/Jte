void call (app_name){
    sh """
        echo "that will be form pielineconfig ${config.name}"
        echo "that will be form paramater ${app_name}"
    """
}