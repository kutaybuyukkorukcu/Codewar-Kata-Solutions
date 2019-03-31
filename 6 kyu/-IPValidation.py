def is_valid_IP(ip):
    octets = ip.split('.')
    if len(octets) != 4: return False
    for octet in octets:
        if not is_valid_octet(octet):
            return False
    return True

def is_valid_octet(octet):
    if not octet.isdigit():
        return False
    if len(octet) > 1 and octet[0] == '0':
        return False
    octet = int(octet)
    if octet >= 0 and octet <= 255:
        return True
    else:
        return False
