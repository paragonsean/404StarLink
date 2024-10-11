# CreateDeliveryStreamInputDeliveryStreamEncryptionConfigurationInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key_arn** | **str** |  | [optional] 
**key_type** | [**KeyType**](KeyType.md) |  | 

## Example

```python
from openapi_client.models.create_delivery_stream_input_delivery_stream_encryption_configuration_input import CreateDeliveryStreamInputDeliveryStreamEncryptionConfigurationInput

# TODO update the JSON string below
json = "{}"
# create an instance of CreateDeliveryStreamInputDeliveryStreamEncryptionConfigurationInput from a JSON string
create_delivery_stream_input_delivery_stream_encryption_configuration_input_instance = CreateDeliveryStreamInputDeliveryStreamEncryptionConfigurationInput.from_json(json)
# print the JSON string representation of the object
print(CreateDeliveryStreamInputDeliveryStreamEncryptionConfigurationInput.to_json())

# convert the object into a dict
create_delivery_stream_input_delivery_stream_encryption_configuration_input_dict = create_delivery_stream_input_delivery_stream_encryption_configuration_input_instance.to_dict()
# create an instance of CreateDeliveryStreamInputDeliveryStreamEncryptionConfigurationInput from a dict
create_delivery_stream_input_delivery_stream_encryption_configuration_input_from_dict = CreateDeliveryStreamInputDeliveryStreamEncryptionConfigurationInput.from_dict(create_delivery_stream_input_delivery_stream_encryption_configuration_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


