# DeliveryStreamEncryptionConfigurationFailureDescription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**DeliveryStreamFailureType**](DeliveryStreamFailureType.md) |  | 
**details** | **str** |  | 

## Example

```python
from openapi_client.models.delivery_stream_encryption_configuration_failure_description import DeliveryStreamEncryptionConfigurationFailureDescription

# TODO update the JSON string below
json = "{}"
# create an instance of DeliveryStreamEncryptionConfigurationFailureDescription from a JSON string
delivery_stream_encryption_configuration_failure_description_instance = DeliveryStreamEncryptionConfigurationFailureDescription.from_json(json)
# print the JSON string representation of the object
print(DeliveryStreamEncryptionConfigurationFailureDescription.to_json())

# convert the object into a dict
delivery_stream_encryption_configuration_failure_description_dict = delivery_stream_encryption_configuration_failure_description_instance.to_dict()
# create an instance of DeliveryStreamEncryptionConfigurationFailureDescription from a dict
delivery_stream_encryption_configuration_failure_description_from_dict = DeliveryStreamEncryptionConfigurationFailureDescription.from_dict(delivery_stream_encryption_configuration_failure_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


