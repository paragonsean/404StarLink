# TagDeliveryStreamInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_stream_name** | **str** |  | 
**tags** | **List** |  | 

## Example

```python
from openapi_client.models.tag_delivery_stream_input import TagDeliveryStreamInput

# TODO update the JSON string below
json = "{}"
# create an instance of TagDeliveryStreamInput from a JSON string
tag_delivery_stream_input_instance = TagDeliveryStreamInput.from_json(json)
# print the JSON string representation of the object
print(TagDeliveryStreamInput.to_json())

# convert the object into a dict
tag_delivery_stream_input_dict = tag_delivery_stream_input_instance.to_dict()
# create an instance of TagDeliveryStreamInput from a dict
tag_delivery_stream_input_from_dict = TagDeliveryStreamInput.from_dict(tag_delivery_stream_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


