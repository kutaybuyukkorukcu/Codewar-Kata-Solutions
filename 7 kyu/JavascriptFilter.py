def search_names(logins):
    
    return filter(lambda (login, email): login.endswith('_'), logins)
