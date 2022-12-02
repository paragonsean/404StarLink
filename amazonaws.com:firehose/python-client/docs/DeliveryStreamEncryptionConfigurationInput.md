# DeliveryStreamEncryptionConfigurationInput

Specifies the type and Amazon Resource Name (ARN) of the CMK to use for Server-Side Encryption (SSE). 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key_arn** | **str** |  | [optional] 
**key_type** | [**KeyType**](KeyType.md) |  | 

## Example

```python
from openapi_client.models.delivery_stream_encryption_configuration_input import DeliveryStreamEncryptionConfigurationInput

# TODO update the JSON string below
json = "{}"
# create an instance of DeliveryStreamEncryptionConfigurationInput from a JSON string
delivery_stream_encryption_configuration_input_instance = DeliveryStreamEncryptionConfigurationInput.from_json(json)
# print the JSON string representation of the object
print(DeliveryStreamEncryptionConfigurationInput.to_json())

# convert the object into a dict
delivery_stream_encryption_configuration_input_dict = delivery_stream_encryption_configuration_input_instance.to_dict()
# create an instance of DeliveryStreamEncryptionConfigurationInput from a dict
delivery_stream_encryption_configuration_input_from_dict = DeliveryStreamEncryptionConfigurationInput.from_dict(delivery_stream_encryption_configuration_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


