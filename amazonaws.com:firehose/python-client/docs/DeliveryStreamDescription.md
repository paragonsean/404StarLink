# DeliveryStreamDescription

Contains information about a delivery stream.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_stream_name** | **str** |  | 
**delivery_stream_arn** | **str** |  | 
**delivery_stream_status** | [**DeliveryStreamStatus**](DeliveryStreamStatus.md) |  | 
**failure_description** | [**DeliveryStreamEncryptionConfigurationFailureDescription**](DeliveryStreamEncryptionConfigurationFailureDescription.md) |  | [optional] 
**delivery_stream_encryption_configuration** | [**DeliveryStreamDescriptionDeliveryStreamEncryptionConfiguration**](DeliveryStreamDescriptionDeliveryStreamEncryptionConfiguration.md) |  | [optional] 
**delivery_stream_type** | [**DeliveryStreamType**](DeliveryStreamType.md) |  | 
**version_id** | **str** |  | 
**create_timestamp** | **datetime** |  | [optional] 
**last_update_timestamp** | **datetime** |  | [optional] 
**source** | [**DeliveryStreamDescriptionSource**](DeliveryStreamDescriptionSource.md) |  | [optional] 
**destinations** | **List** |  | 
**has_more_destinations** | **bool** |  | 

## Example

```python
from openapi_client.models.delivery_stream_description import DeliveryStreamDescription

# TODO update the JSON string below
json = "{}"
# create an instance of DeliveryStreamDescription from a JSON string
delivery_stream_description_instance = DeliveryStreamDescription.from_json(json)
# print the JSON string representation of the object
print(DeliveryStreamDescription.to_json())

# convert the object into a dict
delivery_stream_description_dict = delivery_stream_description_instance.to_dict()
# create an instance of DeliveryStreamDescription from a dict
delivery_stream_description_from_dict = DeliveryStreamDescription.from_dict(delivery_stream_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


