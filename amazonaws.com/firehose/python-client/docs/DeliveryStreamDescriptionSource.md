# DeliveryStreamDescriptionSource


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kinesis_stream_source_description** | [**SourceDescriptionKinesisStreamSourceDescription**](SourceDescriptionKinesisStreamSourceDescription.md) |  | [optional] 

## Example

```python
from openapi_client.models.delivery_stream_description_source import DeliveryStreamDescriptionSource

# TODO update the JSON string below
json = "{}"
# create an instance of DeliveryStreamDescriptionSource from a JSON string
delivery_stream_description_source_instance = DeliveryStreamDescriptionSource.from_json(json)
# print the JSON string representation of the object
print(DeliveryStreamDescriptionSource.to_json())

# convert the object into a dict
delivery_stream_description_source_dict = delivery_stream_description_source_instance.to_dict()
# create an instance of DeliveryStreamDescriptionSource from a dict
delivery_stream_description_source_from_dict = DeliveryStreamDescriptionSource.from_dict(delivery_stream_description_source_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


