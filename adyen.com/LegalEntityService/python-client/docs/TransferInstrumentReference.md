# TransferInstrumentReference


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_identifier** | **str** | The masked IBAN or bank account number. | 
**id** | **str** | The unique identifier of the resource. | 
**real_last_four** | **str** | Four last digits of the bank account number. | [optional] 

## Example

```python
from openapi_client.models.transfer_instrument_reference import TransferInstrumentReference

# TODO update the JSON string below
json = "{}"
# create an instance of TransferInstrumentReference from a JSON string
transfer_instrument_reference_instance = TransferInstrumentReference.from_json(json)
# print the JSON string representation of the object
print(TransferInstrumentReference.to_json())

# convert the object into a dict
transfer_instrument_reference_dict = transfer_instrument_reference_instance.to_dict()
# create an instance of TransferInstrumentReference from a dict
transfer_instrument_reference_from_dict = TransferInstrumentReference.from_dict(transfer_instrument_reference_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


