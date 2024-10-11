# Deinterlacer

Settings for deinterlacer

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**algorithm** | [**DeinterlaceAlgorithm**](DeinterlaceAlgorithm.md) |  | [optional] 
**control** | [**DeinterlacerControl**](DeinterlacerControl.md) |  | [optional] 
**mode** | [**DeinterlacerMode**](DeinterlacerMode.md) |  | [optional] 

## Example

```python
from openapi_client.models.deinterlacer import Deinterlacer

# TODO update the JSON string below
json = "{}"
# create an instance of Deinterlacer from a JSON string
deinterlacer_instance = Deinterlacer.from_json(json)
# print the JSON string representation of the object
print(Deinterlacer.to_json())

# convert the object into a dict
deinterlacer_dict = deinterlacer_instance.to_dict()
# create an instance of Deinterlacer from a dict
deinterlacer_from_dict = Deinterlacer.from_dict(deinterlacer_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


