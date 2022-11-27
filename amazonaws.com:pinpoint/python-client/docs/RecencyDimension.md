# RecencyDimension

Specifies criteria for including or excluding endpoints from a segment based on how recently an endpoint was active.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration** | [**Duration**](Duration.md) |  | 
**recency_type** | [**RecencyType**](RecencyType.md) |  | 

## Example

```python
from openapi_client.models.recency_dimension import RecencyDimension

# TODO update the JSON string below
json = "{}"
# create an instance of RecencyDimension from a JSON string
recency_dimension_instance = RecencyDimension.from_json(json)
# print the JSON string representation of the object
print(RecencyDimension.to_json())

# convert the object into a dict
recency_dimension_dict = recency_dimension_instance.to_dict()
# create an instance of RecencyDimension from a dict
recency_dimension_from_dict = RecencyDimension.from_dict(recency_dimension_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


