# StartCutoverResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job** | [**StartCutoverResponseJob**](StartCutoverResponseJob.md) |  | [optional] 

## Example

```python
from openapi_client.models.start_cutover_response import StartCutoverResponse

# TODO update the JSON string below
json = "{}"
# create an instance of StartCutoverResponse from a JSON string
start_cutover_response_instance = StartCutoverResponse.from_json(json)
# print the JSON string representation of the object
print(StartCutoverResponse.to_json())

# convert the object into a dict
start_cutover_response_dict = start_cutover_response_instance.to_dict()
# create an instance of StartCutoverResponse from a dict
start_cutover_response_from_dict = StartCutoverResponse.from_dict(start_cutover_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


