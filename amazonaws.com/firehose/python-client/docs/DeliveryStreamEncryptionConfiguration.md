# DeliveryStreamEncryptionConfiguration

Contains information about the server-side encryption (SSE) status for the delivery stream, the type customer master key (CMK) in use, if any, and the ARN of the CMK. You can get <code>DeliveryStreamEncryptionConfiguration</code> by invoking the <a>DescribeDeliveryStream</a> operation. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key_arn** | **str** |  | [optional] 
**key_type** | [**KeyType**](KeyType.md) |  | [optional] 
**status** | [**DeliveryStreamEncryptionStatus**](DeliveryStreamEncryptionStatus.md) |  | [optional] 
**failure_description** | [**DeliveryStreamEncryptionConfigurationFailureDescription**](DeliveryStreamEncryptionConfigurationFailureDescription.md) |  | [optional] 

## Example

```python
from openapi_client.models.delivery_stream_encryption_configuration import DeliveryStreamEncryptionConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of DeliveryStreamEncryptionConfiguration from a JSON string
delivery_stream_encryption_configuration_instance = DeliveryStreamEncryptionConfiguration.from_json(json)
# print the JSON string representation of the object
print(DeliveryStreamEncryptionConfiguration.to_json())

# convert the object into a dict
delivery_stream_encryption_configuration_dict = delivery_stream_encryption_configuration_instance.to_dict()
# create an instance of DeliveryStreamEncryptionConfiguration from a dict
delivery_stream_encryption_configuration_from_dict = DeliveryStreamEncryptionConfiguration.from_dict(delivery_stream_encryption_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


