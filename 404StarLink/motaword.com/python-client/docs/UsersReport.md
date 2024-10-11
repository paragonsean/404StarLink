# UsersReport


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**PagingMeta**](PagingMeta.md) |  | [optional] 
**report** | [**List[UsersReportReportInner]**](UsersReportReportInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.users_report import UsersReport

# TODO update the JSON string below
json = "{}"
# create an instance of UsersReport from a JSON string
users_report_instance = UsersReport.from_json(json)
# print the JSON string representation of the object
print(UsersReport.to_json())

# convert the object into a dict
users_report_dict = users_report_instance.to_dict()
# create an instance of UsersReport from a dict
users_report_from_dict = UsersReport.from_dict(users_report_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


