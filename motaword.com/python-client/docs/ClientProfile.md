# ClientProfile


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_creation_date** | **datetime** | the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z | [optional] 
**client_project_count** | **float** | total project count that this client sent | [optional] 
**corporate** | **str** | corporate name | [optional] 
**corporate_id** | **float** | corporate id | [optional] 
**corporate_user_count** | **float** | total user count in a corporation | [optional] 
**frequent_file_extension** | **str** | the file extension for the files that usually this client sent | [optional] 
**frequent_language_pairs** | **List[str]** | frequent language pairs | [optional] 
**full_name** | **str** | full name of the client | [optional] 
**growth** | **bool** | The answer for the question \&quot;Is there any growth for this corporate&#39;s spending\&quot;. The values can be true, false or null if the corporate is oour client for less than 6 months | [optional] 
**is_complex** | **bool** | the answer for the question \&quot;Is this client usually sent complex projects?\&quot; | [optional] 
**last_12_months_spending** | **float** | corporate&#39;s spending in twelve months | [optional] 
**last_project** | **float** | the quote number for the last project of this client | [optional] 
**last_project_time** | **datetime** | the creation date of the last project that is sent by this client | [optional] 
**last_proofreaders** | [**List[ProofreaderWithLanguage]**](ProofreaderWithLanguage.md) | list of prooofreaders for the target languages of last project | [optional] 
**notes** | **List[str]** | notes that is submited for this client and/or with her projects | [optional] 
**nps** | [**ClientProfileNps**](ClientProfileNps.md) |  | [optional] 
**user_rank_in_project_count** | **float** | rank of the user in all corporate users for project count. If the user is the most active user foor sending projects her rank is 1 | [optional] 
**user_rank_in_spending** | **float** | rank of the user in all corporate users for total spending. If the user is the most active user for spending her rank is 1 | [optional] 

## Example

```python
from openapi_client.models.client_profile import ClientProfile

# TODO update the JSON string below
json = "{}"
# create an instance of ClientProfile from a JSON string
client_profile_instance = ClientProfile.from_json(json)
# print the JSON string representation of the object
print(ClientProfile.to_json())

# convert the object into a dict
client_profile_dict = client_profile_instance.to_dict()
# create an instance of ClientProfile from a dict
client_profile_from_dict = ClientProfile.from_dict(client_profile_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


