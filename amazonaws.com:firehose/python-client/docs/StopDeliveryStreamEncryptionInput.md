# StopDeliveryStreamEncryptionInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_stream_name** | **str** |  | 

## Example

```python
from openapi_client.models.stop_delivery_stream_encryption_input import StopDeliveryStreamEncryptionInput

# TODO update the JSON string below
json = "{}"
# create an instance of StopDeliveryStreamEncryptionInput from a JSON string
stop_delivery_stream_encryption_input_instance = StopDeliveryStreamEncryptionInput.from_json(json)
# print the JSON string representation of the object
print(StopDeliveryStreamEncryptionInput.to_json())

# convert the object into a dict
stop_delivery_stream_encryption_input_dict = stop_delivery_stream_encryption_input_instance.to_dict()
# create an instance of StopDeliveryStreamEncryptionInput from a dict
stop_delivery_stream_encryption_input_from_dict = StopDeliveryStreamEncryptionInput.from_dict(stop_delivery_stream_encryption_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


