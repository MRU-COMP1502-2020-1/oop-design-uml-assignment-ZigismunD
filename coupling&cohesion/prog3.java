class MyReader {
    // -------------- unrelated functions
    private boolean validateLocation(String pathIP) {
        return ping(pathIP) && checkFTP(pathIP);
    }
    private boolean checkFTP(String pathIP) {
        return true;
    }

    private boolean ping(String pathIP) {
        return true;
    }

    // -------------- functions related to read resource

    // read the resource from disk
    public String readFromDisk(String pathIP, String fileName) {
        if (validateLocation(pathIP)) {
            return "data of " + fileName;
        } else {
            System.out.println("Invalid location");
            return null;
        }

    }

    // read the resource from web
    public String readFromWeb(String pathIP,String url) {
        if (validateLocation(pathIP)) {
            return "data of " + url;
        } else {
            System.out.println("Invalid location");
            return null;
        }
    }

    // read the resource from network
    public String readFromNetwork(String pathIP,String networkAddress) {
        if (validateLocation(pathIP)) {
            return "data of " + networkAddress;
        } else {
            System.out.println("Invalid location");
            return null;
        }
    }

}