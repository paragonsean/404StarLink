# ListTagsForDeliveryStreamOutput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | **List** |  | 
**has_more_tags** | **bool** |  | 

## Example

```python
from openapi_client.models.list_tags_for_delivery_stream_output import ListTagsForDeliveryStreamOutput

# TODO update the JSON string below
json = "{}"
# create an instance of ListTagsForDeliveryStreamOutput from a JSON string
list_tags_for_delivery_stream_output_instance = ListTagsForDeliveryStreamOutput.from_json(json)
# print the JSON string representation of the object
print(ListTagsForDeliveryStreamOutput.to_json())

# convert the object into a dict
list_tags_for_delivery_stream_output_dict = list_tags_for_delivery_stream_output_instance.to_dict()
# create an instance of ListTagsForDeliveryStreamOutput from a dict
list_tags_for_delivery_stream_output_from_dict = ListTagsForDeliveryStreamOutput.from_dict(list_tags_for_delivery_stream_output_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


