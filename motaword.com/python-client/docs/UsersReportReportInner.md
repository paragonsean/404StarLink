# UsersReportReportInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **str** |  | [optional] 
**spending** | **float** |  | [optional] 
**user** | [**User**](User.md) |  | [optional] 
**word_count** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.users_report_report_inner import UsersReportReportInner

# TODO update the JSON string below
json = "{}"
# create an instance of UsersReportReportInner from a JSON string
users_report_report_inner_instance = UsersReportReportInner.from_json(json)
# print the JSON string representation of the object
print(UsersReportReportInner.to_json())

# convert the object into a dict
users_report_report_inner_dict = users_report_report_inner_instance.to_dict()
# create an instance of UsersReportReportInner from a dict
users_report_report_inner_from_dict = UsersReportReportInner.from_dict(users_report_report_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


