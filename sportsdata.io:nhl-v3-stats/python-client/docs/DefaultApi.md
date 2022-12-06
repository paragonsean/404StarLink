# openapi_client.DefaultApi

All URIs are relative to *http://azure-api.sportsdata.io/v3/nhl/stats*

Method | HTTP request | Description
------------- | ------------- | -------------
[**are_games_in_progress**](DefaultApi.md#are_games_in_progress) | **GET** /{format}/AreAnyGamesInProgress | Are Games In Progress
[**box_score**](DefaultApi.md#box_score) | **GET** /{format}/BoxScore/{gameid} | Box Score
[**box_scores_by_date**](DefaultApi.md#box_scores_by_date) | **GET** /{format}/BoxScores/{date} | Box Scores by Date
[**box_scores_by_date_delta**](DefaultApi.md#box_scores_by_date_delta) | **GET** /{format}/BoxScoresDelta/{date}/{minutes} | Box Scores by Date Delta
[**current_season**](DefaultApi.md#current_season) | **GET** /{format}/CurrentSeason | Current Season
[**dfs_slates_by_date**](DefaultApi.md#dfs_slates_by_date) | **GET** /{format}/DfsSlatesByDate/{date} | DFS Slates by Date
[**games_by_date**](DefaultApi.md#games_by_date) | **GET** /{format}/GamesByDate/{date} | Games by Date
[**line_combinations_by_season**](DefaultApi.md#line_combinations_by_season) | **GET** /{format}/LinesBySeason/{season} | Line Combinations by Season
[**news**](DefaultApi.md#news) | **GET** /{format}/News | News
[**news_by_date**](DefaultApi.md#news_by_date) | **GET** /{format}/NewsByDate/{date} | News by Date
[**news_by_player**](DefaultApi.md#news_by_player) | **GET** /{format}/NewsByPlayerID/{playerid} | News by Player
[**player_details_by_active**](DefaultApi.md#player_details_by_active) | **GET** /{format}/Players | Player Details by Active
[**player_details_by_free_agent**](DefaultApi.md#player_details_by_free_agent) | **GET** /{format}/FreeAgents | Player Details by Free Agent
[**player_details_by_player**](DefaultApi.md#player_details_by_player) | **GET** /{format}/Player/{playerid} | Player Details by Player
[**player_game_logs_by_season**](DefaultApi.md#player_game_logs_by_season) | **GET** /{format}/PlayerGameStatsBySeason/{season}/{playerid}/{numberofgames} | Player Game Logs By Season
[**player_game_stats_by_date**](DefaultApi.md#player_game_stats_by_date) | **GET** /{format}/PlayerGameStatsByDate/{date} | Player Game Stats by Date
[**player_game_stats_by_player**](DefaultApi.md#player_game_stats_by_player) | **GET** /{format}/PlayerGameStatsByPlayer/{date}/{playerid} | Player Game Stats by Player
[**player_season_stats**](DefaultApi.md#player_season_stats) | **GET** /{format}/PlayerSeasonStats/{season} | Player Season Stats
[**player_season_stats_by_player**](DefaultApi.md#player_season_stats_by_player) | **GET** /{format}/PlayerSeasonStatsByPlayer/{season}/{playerid} | Player Season Stats By Player
[**player_season_stats_by_team**](DefaultApi.md#player_season_stats_by_team) | **GET** /{format}/PlayerSeasonStatsByTeam/{season}/{team} | Player Season Stats by Team
[**players_by_team**](DefaultApi.md#players_by_team) | **GET** /{format}/Players/{team} | Players by Team
[**schedules**](DefaultApi.md#schedules) | **GET** /{format}/Games/{season} | Schedules
[**stadiums**](DefaultApi.md#stadiums) | **GET** /{format}/Stadiums | Stadiums
[**standings**](DefaultApi.md#standings) | **GET** /{format}/Standings/{season} | Standings
[**team_game_logs_by_season**](DefaultApi.md#team_game_logs_by_season) | **GET** /{format}/TeamGameStatsBySeason/{season}/{teamid}/{numberofgames} | Team Game Logs By Season
[**team_game_stats_by_date**](DefaultApi.md#team_game_stats_by_date) | **GET** /{format}/TeamGameStatsByDate/{date} | Team Game Stats by Date
[**team_season_stats**](DefaultApi.md#team_season_stats) | **GET** /{format}/TeamSeasonStats/{season} | Team Season Stats
[**team_stats_allowed_by_position**](DefaultApi.md#team_stats_allowed_by_position) | **GET** /{format}/TeamStatsAllowedByPosition/{season} | Team Stats Allowed by Position
[**teams_active**](DefaultApi.md#teams_active) | **GET** /{format}/teams | Teams (Active)
[**teams_all**](DefaultApi.md#teams_all) | **GET** /{format}/AllTeams | Teams (All)


# **are_games_in_progress**
> bool are_games_in_progress(format)

Are Games In Progress

Returns <code>true</code> if there is at least one game being played at the time of the request or <code>false</code> if there are none.

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)

    try:
        # Are Games In Progress
        api_response = api_instance.are_games_in_progress(format)
        print("The response of DefaultApi->are_games_in_progress:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->are_games_in_progress: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]

### Return type

**bool**

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **box_score**
> BoxScore box_score(format, gameid)

Box Score

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.box_score import BoxScore
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    gameid = 'gameid_example' # str | The GameID of an NHL game.  GameIDs can be found in the Games API.  Valid entries are <code>14620</code> or <code>16905</code>

    try:
        # Box Score
        api_response = api_instance.box_score(format, gameid)
        print("The response of DefaultApi->box_score:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->box_score: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **gameid** | **str**| The GameID of an NHL game.  GameIDs can be found in the Games API.  Valid entries are &lt;code&gt;14620&lt;/code&gt; or &lt;code&gt;16905&lt;/code&gt; | 

### Return type

[**BoxScore**](BoxScore.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **box_scores_by_date**
> List[BoxScore] box_scores_by_date(format, var_date)

Box Scores by Date

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.box_score import BoxScore
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    var_date = 'var_date_example' # str | The date of the game(s).  <br>Examples: <code>2017-OCT-31</code>, <code>2018-FEB-15</code>.  

    try:
        # Box Scores by Date
        api_response = api_instance.box_scores_by_date(format, var_date)
        print("The response of DefaultApi->box_scores_by_date:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->box_scores_by_date: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **var_date** | **str**| The date of the game(s).  &lt;br&gt;Examples: &lt;code&gt;2017-OCT-31&lt;/code&gt;, &lt;code&gt;2018-FEB-15&lt;/code&gt;.   | 

### Return type

[**List[BoxScore]**](BoxScore.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **box_scores_by_date_delta**
> List[BoxScore] box_scores_by_date_delta(format, var_date, minutes)

Box Scores by Date Delta

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.box_score import BoxScore
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    var_date = 'var_date_example' # str | The date of the game(s).  <br>Examples: <code>2017-OCT-31</code>, <code>2018-FEB-15</code>.  
    minutes = 'minutes_example' # str | Only returns player statistics that have changed in the last X minutes.  You specify how many minutes in time to go back.  Valid entries are:  <code>1</code> or <code>2</code>.  

    try:
        # Box Scores by Date Delta
        api_response = api_instance.box_scores_by_date_delta(format, var_date, minutes)
        print("The response of DefaultApi->box_scores_by_date_delta:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->box_scores_by_date_delta: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **var_date** | **str**| The date of the game(s).  &lt;br&gt;Examples: &lt;code&gt;2017-OCT-31&lt;/code&gt;, &lt;code&gt;2018-FEB-15&lt;/code&gt;.   | 
 **minutes** | **str**| Only returns player statistics that have changed in the last X minutes.  You specify how many minutes in time to go back.  Valid entries are:  &lt;code&gt;1&lt;/code&gt; or &lt;code&gt;2&lt;/code&gt;.   | 

### Return type

[**List[BoxScore]**](BoxScore.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **current_season**
> Season current_season(format)

Current Season

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.season import Season
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)

    try:
        # Current Season
        api_response = api_instance.current_season(format)
        print("The response of DefaultApi->current_season:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->current_season: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]

### Return type

[**Season**](Season.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dfs_slates_by_date**
> List[DfsSlate] dfs_slates_by_date(format, var_date)

DFS Slates by Date

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.dfs_slate import DfsSlate
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    var_date = 'var_date_example' # str | The date of the game(s). <br>Examples: <code>2017-DEC-01</code>, <code>2018-FEB-15</code>.

    try:
        # DFS Slates by Date
        api_response = api_instance.dfs_slates_by_date(format, var_date)
        print("The response of DefaultApi->dfs_slates_by_date:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->dfs_slates_by_date: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **var_date** | **str**| The date of the game(s). &lt;br&gt;Examples: &lt;code&gt;2017-DEC-01&lt;/code&gt;, &lt;code&gt;2018-FEB-15&lt;/code&gt;. | 

### Return type

[**List[DfsSlate]**](DfsSlate.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **games_by_date**
> List[Game] games_by_date(format, var_date)

Games by Date

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.game import Game
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    var_date = 'var_date_example' # str | The date of the game(s).  <br>Examples: <code>2017-OCT-31</code>, <code>2018-FEB-15</code>.  

    try:
        # Games by Date
        api_response = api_instance.games_by_date(format, var_date)
        print("The response of DefaultApi->games_by_date:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->games_by_date: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **var_date** | **str**| The date of the game(s).  &lt;br&gt;Examples: &lt;code&gt;2017-OCT-31&lt;/code&gt;, &lt;code&gt;2018-FEB-15&lt;/code&gt;.   | 

### Return type

[**List[Game]**](Game.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **line_combinations_by_season**
> List[TeamLine] line_combinations_by_season(format, season)

Line Combinations by Season

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.team_line import TeamLine
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    season = 'season_example' # str | Year of the season.  <br>Examples: <code>2016</code>, <code>2017</code>.  

    try:
        # Line Combinations by Season
        api_response = api_instance.line_combinations_by_season(format, season)
        print("The response of DefaultApi->line_combinations_by_season:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->line_combinations_by_season: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **season** | **str**| Year of the season.  &lt;br&gt;Examples: &lt;code&gt;2016&lt;/code&gt;, &lt;code&gt;2017&lt;/code&gt;.   | 

### Return type

[**List[TeamLine]**](TeamLine.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **news**
> List[News] news(format)

News

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.news import News
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)

    try:
        # News
        api_response = api_instance.news(format)
        print("The response of DefaultApi->news:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->news: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]

### Return type

[**List[News]**](News.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **news_by_date**
> List[News] news_by_date(format, var_date)

News by Date

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.news import News
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    var_date = 'var_date_example' # str | The date of the news.  <br>Examples: <code>2017-OCT-31</code>, <code>2018-FEB-15</code>.  

    try:
        # News by Date
        api_response = api_instance.news_by_date(format, var_date)
        print("The response of DefaultApi->news_by_date:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->news_by_date: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **var_date** | **str**| The date of the news.  &lt;br&gt;Examples: &lt;code&gt;2017-OCT-31&lt;/code&gt;, &lt;code&gt;2018-FEB-15&lt;/code&gt;.   | 

### Return type

[**List[News]**](News.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **news_by_player**
> List[News] news_by_player(format, playerid)

News by Player

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.news import News
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    playerid = 'playerid_example' # str | Unique FantasyData Player ID.  Example:<code>10000507</code>.  

    try:
        # News by Player
        api_response = api_instance.news_by_player(format, playerid)
        print("The response of DefaultApi->news_by_player:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->news_by_player: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **playerid** | **str**| Unique FantasyData Player ID.  Example:&lt;code&gt;10000507&lt;/code&gt;.   | 

### Return type

[**List[News]**](News.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **player_details_by_active**
> List[Player] player_details_by_active(format)

Player Details by Active

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.player import Player
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)

    try:
        # Player Details by Active
        api_response = api_instance.player_details_by_active(format)
        print("The response of DefaultApi->player_details_by_active:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->player_details_by_active: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]

### Return type

[**List[Player]**](Player.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **player_details_by_free_agent**
> List[Player] player_details_by_free_agent(format)

Player Details by Free Agent

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.player import Player
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)

    try:
        # Player Details by Free Agent
        api_response = api_instance.player_details_by_free_agent(format)
        print("The response of DefaultApi->player_details_by_free_agent:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->player_details_by_free_agent: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]

### Return type

[**List[Player]**](Player.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **player_details_by_player**
> Player player_details_by_player(format, playerid)

Player Details by Player

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.player import Player
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    playerid = 'playerid_example' # str | Unique FantasyData Player ID. Example:<code>30000007</code>.

    try:
        # Player Details by Player
        api_response = api_instance.player_details_by_player(format, playerid)
        print("The response of DefaultApi->player_details_by_player:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->player_details_by_player: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **playerid** | **str**| Unique FantasyData Player ID. Example:&lt;code&gt;30000007&lt;/code&gt;. | 

### Return type

[**Player**](Player.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **player_game_logs_by_season**
> List[PlayerGame] player_game_logs_by_season(format, season, playerid, numberofgames)

Player Game Logs By Season

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.player_game import PlayerGame
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = 'format_example' # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>.
    season = 'season_example' # str | Season to get games from. Example <code>2019POST</code>, <code>2020</code>
    playerid = 'playerid_example' # str | Unique FantasyData Player ID. Example:<code>30000651</code>.
    numberofgames = 'numberofgames_example' # str | How many games to return. Example <code>all</code>, <code>10</code>, <code>25</code>

    try:
        # Player Game Logs By Season
        api_response = api_instance.player_game_logs_by_season(format, season, playerid, numberofgames)
        print("The response of DefaultApi->player_game_logs_by_season:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->player_game_logs_by_season: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | 
 **season** | **str**| Season to get games from. Example &lt;code&gt;2019POST&lt;/code&gt;, &lt;code&gt;2020&lt;/code&gt; | 
 **playerid** | **str**| Unique FantasyData Player ID. Example:&lt;code&gt;30000651&lt;/code&gt;. | 
 **numberofgames** | **str**| How many games to return. Example &lt;code&gt;all&lt;/code&gt;, &lt;code&gt;10&lt;/code&gt;, &lt;code&gt;25&lt;/code&gt; | 

### Return type

[**List[PlayerGame]**](PlayerGame.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **player_game_stats_by_date**
> List[PlayerGame] player_game_stats_by_date(format, var_date)

Player Game Stats by Date

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.player_game import PlayerGame
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    var_date = 'var_date_example' # str | The date of the game(s).  <br>Examples: <code>2017-OCT-31</code>, <code>2018-FEB-15</code>.  

    try:
        # Player Game Stats by Date
        api_response = api_instance.player_game_stats_by_date(format, var_date)
        print("The response of DefaultApi->player_game_stats_by_date:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->player_game_stats_by_date: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **var_date** | **str**| The date of the game(s).  &lt;br&gt;Examples: &lt;code&gt;2017-OCT-31&lt;/code&gt;, &lt;code&gt;2018-FEB-15&lt;/code&gt;.   | 

### Return type

[**List[PlayerGame]**](PlayerGame.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **player_game_stats_by_player**
> PlayerGame player_game_stats_by_player(format, var_date, playerid)

Player Game Stats by Player

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.player_game import PlayerGame
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    var_date = 'var_date_example' # str | The date of the game(s).  <br>Examples: <code>2018-JAN-31</code>, <code>2017-OCT-01</code>.  
    playerid = 'playerid_example' # str | Unique FantasyData Player ID. Example:<code>30000378</code>.

    try:
        # Player Game Stats by Player
        api_response = api_instance.player_game_stats_by_player(format, var_date, playerid)
        print("The response of DefaultApi->player_game_stats_by_player:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->player_game_stats_by_player: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **var_date** | **str**| The date of the game(s).  &lt;br&gt;Examples: &lt;code&gt;2018-JAN-31&lt;/code&gt;, &lt;code&gt;2017-OCT-01&lt;/code&gt;.   | 
 **playerid** | **str**| Unique FantasyData Player ID. Example:&lt;code&gt;30000378&lt;/code&gt;. | 

### Return type

[**PlayerGame**](PlayerGame.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **player_season_stats**
> List[PlayerSeason] player_season_stats(format, season)

Player Season Stats

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.player_season import PlayerSeason
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    season = 'season_example' # str | Year of the season.  <br>Examples: <code>2016</code>, <code>2017</code>.  

    try:
        # Player Season Stats
        api_response = api_instance.player_season_stats(format, season)
        print("The response of DefaultApi->player_season_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->player_season_stats: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **season** | **str**| Year of the season.  &lt;br&gt;Examples: &lt;code&gt;2016&lt;/code&gt;, &lt;code&gt;2017&lt;/code&gt;.   | 

### Return type

[**List[PlayerSeason]**](PlayerSeason.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **player_season_stats_by_player**
> PlayerSeason player_season_stats_by_player(format, season, playerid)

Player Season Stats By Player

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.player_season import PlayerSeason
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    season = 'season_example' # str | Year of the season.  <br>Examples: <code>2016</code>, <code>2017</code>.  
    playerid = 'playerid_example' # str | Unique FantasyData Player ID. Example:<code>30000378</code>.

    try:
        # Player Season Stats By Player
        api_response = api_instance.player_season_stats_by_player(format, season, playerid)
        print("The response of DefaultApi->player_season_stats_by_player:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->player_season_stats_by_player: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **season** | **str**| Year of the season.  &lt;br&gt;Examples: &lt;code&gt;2016&lt;/code&gt;, &lt;code&gt;2017&lt;/code&gt;.   | 
 **playerid** | **str**| Unique FantasyData Player ID. Example:&lt;code&gt;30000378&lt;/code&gt;. | 

### Return type

[**PlayerSeason**](PlayerSeason.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **player_season_stats_by_team**
> List[PlayerSeason] player_season_stats_by_team(format, season, team)

Player Season Stats by Team

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.player_season import PlayerSeason
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    season = 'season_example' # str | Year of the season.  <br>Examples: <code>2016</code>, <code>2017</code>.  
    team = 'team_example' # str | The abbreviation of the requested team.  <br>Examples: <code>SF</code>, <code>NYY</code>.  

    try:
        # Player Season Stats by Team
        api_response = api_instance.player_season_stats_by_team(format, season, team)
        print("The response of DefaultApi->player_season_stats_by_team:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->player_season_stats_by_team: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **season** | **str**| Year of the season.  &lt;br&gt;Examples: &lt;code&gt;2016&lt;/code&gt;, &lt;code&gt;2017&lt;/code&gt;.   | 
 **team** | **str**| The abbreviation of the requested team.  &lt;br&gt;Examples: &lt;code&gt;SF&lt;/code&gt;, &lt;code&gt;NYY&lt;/code&gt;.   | 

### Return type

[**List[PlayerSeason]**](PlayerSeason.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **players_by_team**
> List[Player] players_by_team(format, team)

Players by Team

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.player import Player
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    team = 'team_example' # str | The abbreviation of the requested team.  <br>Examples: <code>SF</code>, <code>NYY</code>.  

    try:
        # Players by Team
        api_response = api_instance.players_by_team(format, team)
        print("The response of DefaultApi->players_by_team:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->players_by_team: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **team** | **str**| The abbreviation of the requested team.  &lt;br&gt;Examples: &lt;code&gt;SF&lt;/code&gt;, &lt;code&gt;NYY&lt;/code&gt;.   | 

### Return type

[**List[Player]**](Player.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **schedules**
> List[Game] schedules(format, season)

Schedules

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.game import Game
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    season = 'season_example' # str | Year of the season (with optional season type).<br>Examples: <code>2018</code>, <code>2018PRE</code>, <code>2018POST</code>, <code>2018STAR</code>, <code>2019</code>, etc.

    try:
        # Schedules
        api_response = api_instance.schedules(format, season)
        print("The response of DefaultApi->schedules:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->schedules: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **season** | **str**| Year of the season (with optional season type).&lt;br&gt;Examples: &lt;code&gt;2018&lt;/code&gt;, &lt;code&gt;2018PRE&lt;/code&gt;, &lt;code&gt;2018POST&lt;/code&gt;, &lt;code&gt;2018STAR&lt;/code&gt;, &lt;code&gt;2019&lt;/code&gt;, etc. | 

### Return type

[**List[Game]**](Game.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stadiums**
> List[Stadium] stadiums(format)

Stadiums

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.stadium import Stadium
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = xml # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to xml)

    try:
        # Stadiums
        api_response = api_instance.stadiums(format)
        print("The response of DefaultApi->stadiums:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->stadiums: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]

### Return type

[**List[Stadium]**](Stadium.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **standings**
> List[Standing] standings(format, season)

Standings

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.standing import Standing
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    season = 'season_example' # str | Year of the season.  <br>Examples: <code>2016</code>, <code>2017</code>.  

    try:
        # Standings
        api_response = api_instance.standings(format, season)
        print("The response of DefaultApi->standings:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->standings: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **season** | **str**| Year of the season.  &lt;br&gt;Examples: &lt;code&gt;2016&lt;/code&gt;, &lt;code&gt;2017&lt;/code&gt;.   | 

### Return type

[**List[Standing]**](Standing.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **team_game_logs_by_season**
> List[TeamGame] team_game_logs_by_season(format, season, teamid, numberofgames)

Team Game Logs By Season

Game by game log of total team statistics.

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.team_game import TeamGame
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = 'format_example' # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>.
    season = 'season_example' # str | Season to get games from. Example <code>2019POST</code>, <code>2020</code>
    teamid = 'teamid_example' # str | Unique ID of team.  Example <code> 8 </code>
    numberofgames = 'numberofgames_example' # str | How many games to return. Example <code>all</code>, <code>10</code>, <code>25</code>

    try:
        # Team Game Logs By Season
        api_response = api_instance.team_game_logs_by_season(format, season, teamid, numberofgames)
        print("The response of DefaultApi->team_game_logs_by_season:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->team_game_logs_by_season: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | 
 **season** | **str**| Season to get games from. Example &lt;code&gt;2019POST&lt;/code&gt;, &lt;code&gt;2020&lt;/code&gt; | 
 **teamid** | **str**| Unique ID of team.  Example &lt;code&gt; 8 &lt;/code&gt; | 
 **numberofgames** | **str**| How many games to return. Example &lt;code&gt;all&lt;/code&gt;, &lt;code&gt;10&lt;/code&gt;, &lt;code&gt;25&lt;/code&gt; | 

### Return type

[**List[TeamGame]**](TeamGame.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **team_game_stats_by_date**
> List[TeamGame] team_game_stats_by_date(format, var_date)

Team Game Stats by Date

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.team_game import TeamGame
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    var_date = 'var_date_example' # str | The date of the game(s).  <br>Examples: <code>2018-JAN-31</code>, <code>2017-OCT-01</code>.  

    try:
        # Team Game Stats by Date
        api_response = api_instance.team_game_stats_by_date(format, var_date)
        print("The response of DefaultApi->team_game_stats_by_date:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->team_game_stats_by_date: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **var_date** | **str**| The date of the game(s).  &lt;br&gt;Examples: &lt;code&gt;2018-JAN-31&lt;/code&gt;, &lt;code&gt;2017-OCT-01&lt;/code&gt;.   | 

### Return type

[**List[TeamGame]**](TeamGame.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **team_season_stats**
> List[TeamSeason] team_season_stats(format, season)

Team Season Stats

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.team_season import TeamSeason
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    season = 'season_example' # str | Year of the season.  <br>Examples: <code>2016</code>, <code>2017</code>.  

    try:
        # Team Season Stats
        api_response = api_instance.team_season_stats(format, season)
        print("The response of DefaultApi->team_season_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->team_season_stats: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **season** | **str**| Year of the season.  &lt;br&gt;Examples: &lt;code&gt;2016&lt;/code&gt;, &lt;code&gt;2017&lt;/code&gt;.   | 

### Return type

[**List[TeamSeason]**](TeamSeason.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **team_stats_allowed_by_position**
> List[TeamSeason] team_stats_allowed_by_position(format, season)

Team Stats Allowed by Position

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.team_season import TeamSeason
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)
    season = 'season_example' # str | Year of the season.  <br>Examples: <code>2016</code>, <code>2017</code>.  

    try:
        # Team Stats Allowed by Position
        api_response = api_instance.team_stats_allowed_by_position(format, season)
        print("The response of DefaultApi->team_stats_allowed_by_position:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->team_stats_allowed_by_position: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]
 **season** | **str**| Year of the season.  &lt;br&gt;Examples: &lt;code&gt;2016&lt;/code&gt;, &lt;code&gt;2017&lt;/code&gt;.   | 

### Return type

[**List[TeamSeason]**](TeamSeason.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **teams_active**
> List[Team] teams_active(format)

Teams (Active)

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.team import Team
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)

    try:
        # Teams (Active)
        api_response = api_instance.teams_active(format)
        print("The response of DefaultApi->teams_active:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->teams_active: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]

### Return type

[**List[Team]**](Team.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **teams_all**
> List[Team] teams_all(format)

Teams (All)

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.team import Team
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/nhl/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/nhl/stats"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKeyQuery
configuration.api_key['apiKeyQuery'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyQuery'] = 'Bearer'

# Configure API key authorization: apiKeyHeader
configuration.api_key['apiKeyHeader'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKeyHeader'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    format = XML # str | Desired response format. Valid entries are <code>XML</code> or <code>JSON</code>. (default to XML)

    try:
        # Teams (All)
        api_response = api_instance.teams_all(format)
        print("The response of DefaultApi->teams_all:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->teams_all: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to XML]

### Return type

[**List[Team]**](Team.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery), [apiKeyHeader](../README.md#apiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

