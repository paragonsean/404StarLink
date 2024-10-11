# StartDeliveryStreamEncryptionInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_stream_name** | **str** |  | 
**delivery_stream_encryption_configuration_input** | [**CreateDeliveryStreamInputDeliveryStreamEncryptionConfigurationInput**](CreateDeliveryStreamInputDeliveryStreamEncryptionConfigurationInput.md) |  | [optional] 

## Example

```python
from openapi_client.models.start_delivery_stream_encryption_input import StartDeliveryStreamEncryptionInput

# TODO update the JSON string below
json = "{}"
# create an instance of StartDeliveryStreamEncryptionInput from a JSON string
start_delivery_stream_encryption_input_instance = StartDeliveryStreamEncryptionInput.from_json(json)
# print the JSON string representation of the object
print(StartDeliveryStreamEncryptionInput.to_json())

# convert the object into a dict
start_delivery_stream_encryption_input_dict = start_delivery_stream_encryption_input_instance.to_dict()
# create an instance of StartDeliveryStreamEncryptionInput from a dict
start_delivery_stream_encryption_input_from_dict = StartDeliveryStreamEncryptionInput.from_dict(start_delivery_stream_encryption_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


