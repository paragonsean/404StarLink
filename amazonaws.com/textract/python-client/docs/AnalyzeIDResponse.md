# AnalyzeIDResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_documents** | **List** |  | [optional] 
**document_metadata** | [**DocumentMetadata**](DocumentMetadata.md) |  | [optional] 
**analyze_id_model_version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.analyze_id_response import AnalyzeIDResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AnalyzeIDResponse from a JSON string
analyze_id_response_instance = AnalyzeIDResponse.from_json(json)
# print the JSON string representation of the object
print(AnalyzeIDResponse.to_json())

# convert the object into a dict
analyze_id_response_dict = analyze_id_response_instance.to_dict()
# create an instance of AnalyzeIDResponse from a dict
analyze_id_response_from_dict = AnalyzeIDResponse.from_dict(analyze_id_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


