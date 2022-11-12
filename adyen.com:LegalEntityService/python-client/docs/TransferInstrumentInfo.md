# TransferInstrumentInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_account** | [**BankAccountInfo**](BankAccountInfo.md) | Contains information about the legal entity&#39;s bank account. | 
**legal_entity_id** | **str** | The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id) that owns the transfer instrument. | 
**type** | **str** | The type of transfer instrument.  Possible value: **bankAccount**. | 

## Example

```python
from openapi_client.models.transfer_instrument_info import TransferInstrumentInfo

# TODO update the JSON string below
json = "{}"
# create an instance of TransferInstrumentInfo from a JSON string
transfer_instrument_info_instance = TransferInstrumentInfo.from_json(json)
# print the JSON string representation of the object
print(TransferInstrumentInfo.to_json())

# convert the object into a dict
transfer_instrument_info_dict = transfer_instrument_info_instance.to_dict()
# create an instance of TransferInstrumentInfo from a dict
transfer_instrument_info_from_dict = TransferInstrumentInfo.from_dict(transfer_instrument_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


