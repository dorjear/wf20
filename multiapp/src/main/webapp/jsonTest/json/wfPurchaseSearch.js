var wfPurchaseSearchRequestJSON = {
	"cmd": "wfPurchaseSearch",
	"searchCriteria":
	[
		{
			"fieldName":"userId",
			"operator":"eq",  //cn-contains|nc-does not contain|eq-equal|ne-not equal|lt-less|le-less or equal|gt-greater|ge-greater or equal
			"value":"binglee"
		},
		{
			"fieldName":"purchaseDate",
			"operator":"eq",  //cn-contains|nc-does not contain|eq-equal|ne-not equal|lt-less|le-less or equal|gt-greater|ge-greater or equal
			"value":"08/10/2013"
		},
		{
			"fieldName":"applicationNumber",
			"operator":"eq",  //cn-contains|nc-does not contain|eq-equal|ne-not equal|lt-less|le-less or equal|gt-greater|ge-greater or equal
			"value":"OB0000703"
		}
	]
};