var wfApplicationSearchRequestJSON ={
	"cmd": "wfAppSearch",
	"searchCriteria":
	[
		{
			"fieldName":"applicationnumber",
			"operator":"eq",  //cn-contains|nc-does not contain|eq-equal|ne-not equal|lt-less|le-less or equal|gt-greater|ge-greater or equal
			"value":"TT1111111",
		},
		{
			"fieldName":"logo",
			"operator":"eq",  //cn-contains|nc-does not contain|eq-equal|ne-not equal|lt-less|le-less or equal|gt-greater|ge-greater or equal
			"value":"D1",
		},
		{
			"fieldName":"market",
			"operator":"eq",  //cn-contains|nc-does not contain|eq-equal|ne-not equal|lt-less|le-less or equal|gt-greater|ge-greater or equal
			"value":"027",
		}
	]
};