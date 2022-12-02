# DeliveryStreamDescriptionDeliveryStreamEncryptionConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key_arn** | **str** |  | [optional] 
**key_type** | [**KeyType**](KeyType.md) |  | [optional] 
**status** | [**DeliveryStreamEncryptionStatus**](DeliveryStreamEncryptionStatus.md) |  | [optional] 
**failure_description** | [**DeliveryStreamEncryptionConfigurationFailureDescription**](DeliveryStreamEncryptionConfigurationFailureDescription.md) |  | [optional] 

## Example

```python
from openapi_client.models.delivery_stream_description_delivery_stream_encryption_configuration import DeliveryStreamDescriptionDeliveryStreamEncryptionConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of DeliveryStreamDescriptionDeliveryStreamEncryptionConfiguration from a JSON string
delivery_stream_description_delivery_stream_encryption_configuration_instance = DeliveryStreamDescriptionDeliveryStreamEncryptionConfiguration.from_json(json)
# print the JSON string representation of the object
print(DeliveryStreamDescriptionDeliveryStreamEncryptionConfiguration.to_json())

# convert the object into a dict
delivery_stream_description_delivery_stream_encryption_configuration_dict = delivery_stream_description_delivery_stream_encryption_configuration_instance.to_dict()
# create an instance of DeliveryStreamDescriptionDeliveryStreamEncryptionConfiguration from a dict
delivery_stream_description_delivery_stream_encryption_configuration_from_dict = DeliveryStreamDescriptionDeliveryStreamEncryptionConfiguration.from_dict(delivery_stream_description_delivery_stream_encryption_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


