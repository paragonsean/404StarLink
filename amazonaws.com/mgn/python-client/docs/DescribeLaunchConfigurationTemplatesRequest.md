# DescribeLaunchConfigurationTemplatesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**launch_configuration_template_ids** | **List[str]** | Request to filter Launch Configuration Templates list by Launch Configuration Template ID. | [optional] 
**max_results** | **int** | Maximum results to be returned in DescribeLaunchConfigurationTemplates. | [optional] 
**next_token** | **str** | Next pagination token returned from DescribeLaunchConfigurationTemplates. | [optional] 

## Example

```python
from openapi_client.models.describe_launch_configuration_templates_request import DescribeLaunchConfigurationTemplatesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeLaunchConfigurationTemplatesRequest from a JSON string
describe_launch_configuration_templates_request_instance = DescribeLaunchConfigurationTemplatesRequest.from_json(json)
# print the JSON string representation of the object
print(DescribeLaunchConfigurationTemplatesRequest.to_json())

# convert the object into a dict
describe_launch_configuration_templates_request_dict = describe_launch_configuration_templates_request_instance.to_dict()
# create an instance of DescribeLaunchConfigurationTemplatesRequest from a dict
describe_launch_configuration_templates_request_from_dict = DescribeLaunchConfigurationTemplatesRequest.from_dict(describe_launch_configuration_templates_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


