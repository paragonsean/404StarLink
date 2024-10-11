# CheckRun

A check performed on the code of a given code change

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app** | [**NullableIntegration**](NullableIntegration.md) |  | 
**check_suite** | [**CheckRunCheckSuite**](CheckRunCheckSuite.md) |  | 
**completed_at** | **datetime** |  | 
**conclusion** | **str** |  | 
**deployment** | [**DeploymentSimple**](DeploymentSimple.md) |  | [optional] 
**details_url** | **str** |  | 
**external_id** | **str** |  | 
**head_sha** | **str** | The SHA of the commit that is being checked. | 
**html_url** | **str** |  | 
**id** | **int** | The id of the check. | 
**name** | **str** | The name of the check. | 
**node_id** | **str** |  | 
**output** | [**CheckRunOutput**](CheckRunOutput.md) |  | 
**pull_requests** | [**List[PullRequestMinimal]**](PullRequestMinimal.md) |  | 
**started_at** | **datetime** |  | 
**status** | **str** | The phase of the lifecycle that the check is currently in. | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.check_run import CheckRun

# TODO update the JSON string below
json = "{}"
# create an instance of CheckRun from a JSON string
check_run_instance = CheckRun.from_json(json)
# print the JSON string representation of the object
print(CheckRun.to_json())

# convert the object into a dict
check_run_dict = check_run_instance.to_dict()
# create an instance of CheckRun from a dict
check_run_from_dict = CheckRun.from_dict(check_run_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


