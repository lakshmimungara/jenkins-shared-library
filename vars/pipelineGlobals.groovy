
def getAccountID(String environment){
    switch(environment) { 
        case 'dev': 
            return "169810528182"
        case 'qa':
            return "169810528182"
        case 'uat':
            return "169810528182"
        case 'pre-prod':
            return "169810528182"
        case 'prod':
            return "169810528182"
        default:
            return "nothing"
    } 
}
