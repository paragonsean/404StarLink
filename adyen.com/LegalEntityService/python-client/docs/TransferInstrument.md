# TransferInstrument


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_account** | [**BankAccountInfo**](BankAccountInfo.md) | Contains information about the legal entity&#39;s bank account. | 
**capabilities** | [**Dict[str, SupportingEntityCapability]**](SupportingEntityCapability.md) | List of capabilities for this supporting entity. | [optional] 
**document_details** | [**List[DocumentReference]**](DocumentReference.md) | List of documents uploaded for the transfer instrument. | [optional] 
**id** | **str** | The unique identifier of the transfer instrument. | [readonly] 
**legal_entity_id** | **str** | The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id) that owns the transfer instrument. | 
**problems** | [**List[CapabilityProblem]**](CapabilityProblem.md) | List of the verification errors from capabilities for this supporting entity. | [optional] 
**type** | **str** | The type of transfer instrument.  Possible value: **bankAccount**. | 

## Example

```python
from openapi_client.models.transfer_instrument import TransferInstrument

# TODO update the JSON string below
json = "{}"
# create an instance of TransferInstrument from a JSON string
transfer_instrument_instance = TransferInstrument.from_json(json)
# print the JSON string representation of the object
print(TransferInstrument.to_json())

# convert the object into a dict
transfer_instrument_dict = transfer_instrument_instance.to_dict()
# create an instance of TransferInstrument from a dict
transfer_instrument_from_dict = TransferInstrument.from_dict(transfer_instrument_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


