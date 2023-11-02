Path Parameters
--------------------------------------------------
Path Parameter also Used to send data to server in the URL
Path Parameter Also called as URI Parameters
Path Parameter Can be present anywhere in URL
Path Parameter Will start with '/' and will be separated by '/' only
Path Parameter represent value directly
ex-1 www.ashokit.in/course/{SBMS}
ex-2 www.ashokit.in/course{SBMS}/trainer/{Vivek}

if name doesn't match

At Rest Api side we will use @PathVariable annotation to read Pathparameter value from URL
we can have more than one Pathparameter in one url
