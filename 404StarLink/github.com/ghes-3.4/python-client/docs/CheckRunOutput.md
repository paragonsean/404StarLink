# CheckRunOutput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotations_count** | **int** |  | 
**annotations_url** | **str** |  | 
**summary** | **str** |  | 
**text** | **str** |  | 
**title** | **str** |  | 

## Example

```python
from openapi_client.models.check_run_output import CheckRunOutput

# TODO update the JSON string below
json = "{}"
# create an instance of CheckRunOutput from a JSON string
check_run_output_instance = CheckRunOutput.from_json(json)
# print the JSON string representation of the object
print(CheckRunOutput.to_json())

# convert the object into a dict
check_run_output_dict = check_run_output_instance.to_dict()
# create an instance of CheckRunOutput from a dict
check_run_output_from_dict = CheckRunOutput.from_dict(check_run_output_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


