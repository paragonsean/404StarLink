# SegmentDemographicsModel


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimension_type** | [**DimensionType**](DimensionType.md) |  | [optional] 
**values** | **List** |  | 

## Example

```python
from openapi_client.models.segment_demographics_model import SegmentDemographicsModel

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentDemographicsModel from a JSON string
segment_demographics_model_instance = SegmentDemographicsModel.from_json(json)
# print the JSON string representation of the object
print(SegmentDemographicsModel.to_json())

# convert the object into a dict
segment_demographics_model_dict = segment_demographics_model_instance.to_dict()
# create an instance of SegmentDemographicsModel from a dict
segment_demographics_model_from_dict = SegmentDemographicsModel.from_dict(segment_demographics_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


