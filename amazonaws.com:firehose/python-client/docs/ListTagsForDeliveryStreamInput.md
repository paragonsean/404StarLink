# ListTagsForDeliveryStreamInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_stream_name** | **str** |  | 
**exclusive_start_tag_key** | **str** |  | [optional] 
**limit** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.list_tags_for_delivery_stream_input import ListTagsForDeliveryStreamInput

# TODO update the JSON string below
json = "{}"
# create an instance of ListTagsForDeliveryStreamInput from a JSON string
list_tags_for_delivery_stream_input_instance = ListTagsForDeliveryStreamInput.from_json(json)
# print the JSON string representation of the object
print(ListTagsForDeliveryStreamInput.to_json())

# convert the object into a dict
list_tags_for_delivery_stream_input_dict = list_tags_for_delivery_stream_input_instance.to_dict()
# create an instance of ListTagsForDeliveryStreamInput from a dict
list_tags_for_delivery_stream_input_from_dict = ListTagsForDeliveryStreamInput.from_dict(list_tags_for_delivery_stream_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


