# Classification

Classification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**genre** | [**Level**](Level.md) |  | [optional] 
**primary** | **bool** | True if this is the entity&#39;s primary classification | [optional] [default to False]
**segment** | [**Segment**](Segment.md) |  | [optional] 
**sub_genre** | [**Level**](Level.md) |  | [optional] 
**sub_type** | [**Level**](Level.md) |  | [optional] 
**type** | [**Level**](Level.md) |  | [optional] 

## Example

```python
from openapi_client.models.classification import Classification

# TODO update the JSON string below
json = "{}"
# create an instance of Classification from a JSON string
classification_instance = Classification.from_json(json)
# print the JSON string representation of the object
print(Classification.to_json())

# convert the object into a dict
classification_dict = classification_instance.to_dict()
# create an instance of Classification from a dict
classification_from_dict = Classification.from_dict(classification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


