# CareContextRepresentation


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**display** | **str** |  | 
**reference_number** | **str** |  | 

## Example

```python
from openapi_client.models.care_context_representation import CareContextRepresentation

# TODO update the JSON string below
json = "{}"
# create an instance of CareContextRepresentation from a JSON string
care_context_representation_instance = CareContextRepresentation.from_json(json)
# print the JSON string representation of the object
print(CareContextRepresentation.to_json())

# convert the object into a dict
care_context_representation_dict = care_context_representation_instance.to_dict()
# create an instance of CareContextRepresentation from a dict
care_context_representation_from_dict = CareContextRepresentation.from_dict(care_context_representation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


