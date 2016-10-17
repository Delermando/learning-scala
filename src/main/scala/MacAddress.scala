val nicaddresses = for {
	nic <- NetworkInterface.getNetworkInterfaces.asScala
	addrbytes <- Option(nic.getHardwareAddress)
}yield{
	addrbytes map { "%02x" format _ } mkString ";"
}

nicaddresses foreach println