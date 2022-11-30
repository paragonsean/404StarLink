# openapi_client.DefaultApi

All URIs are relative to *http://azure-api.sportsdata.io/v3/soccer/stats*

Method | HTTP request | Description
------------- | ------------- | -------------
[**areas_countries**](DefaultApi.md#areas_countries) | **GET** /{format}/Areas | Areas (Countries)
[**box_score**](DefaultApi.md#box_score) | **GET** /{format}/BoxScore/{gameid} | Box Score
[**box_scores_by_date**](DefaultApi.md#box_scores_by_date) | **GET** /{format}/BoxScores/{date} | Box Scores by Date
[**box_scores_by_date_by_competition**](DefaultApi.md#box_scores_by_date_by_competition) | **GET** /{format}/BoxScoresByCompetition/{competition}/{date} | Box Scores by Date by Competition
[**box_scores_by_date_delta**](DefaultApi.md#box_scores_by_date_delta) | **GET** /{format}/BoxScoresDelta/{date}/{minutes} | Box Scores by Date Delta
[**box_scores_delta_by_date_by_competition**](DefaultApi.md#box_scores_delta_by_date_by_competition) | **GET** /{format}/BoxScoresDeltaByCompetition/{competition}/{date}/{minutes} | Box Scores Delta by Date by Competition
[**competition_fixtures_league_details**](DefaultApi.md#competition_fixtures_league_details) | **GET** /{format}/CompetitionDetails/{competition} | Competition Fixtures (League Details)
[**competition_hierarchy_league_hierarchy**](DefaultApi.md#competition_hierarchy_league_hierarchy) | **GET** /{format}/CompetitionHierarchy | Competition Hierarchy (League Hierarchy)
[**competitions_leagues**](DefaultApi.md#competitions_leagues) | **GET** /{format}/Competitions | Competitions (Leagues)
[**dfs_slates_by_date**](DefaultApi.md#dfs_slates_by_date) | **GET** /{format}/DfsSlatesByDate/{date} | Dfs Slates By Date
[**games_by_date**](DefaultApi.md#games_by_date) | **GET** /{format}/GamesByDate/{date} | Games by Date
[**memberships_active**](DefaultApi.md#memberships_active) | **GET** /{format}/ActiveMemberships | Memberships (Active)
[**memberships_by_competition_active**](DefaultApi.md#memberships_by_competition_active) | **GET** /{format}/MembershipsByCompetition/{competition} | Memberships by Competition (Active)
[**memberships_by_competition_historical**](DefaultApi.md#memberships_by_competition_historical) | **GET** /{format}/HistoricalMembershipsByCompetition/{competition} | Memberships by Competition (Historical)
[**memberships_by_team_active**](DefaultApi.md#memberships_by_team_active) | **GET** /{format}/MembershipsByTeam/{teamid} | Memberships by Team (Active)
[**memberships_by_team_historical**](DefaultApi.md#memberships_by_team_historical) | **GET** /{format}/HistoricalMembershipsByTeam/{teamid} | Memberships by Team (Historical)
[**memberships_historical**](DefaultApi.md#memberships_historical) | **GET** /{format}/HistoricalMemberships | Memberships (Historical)
[**memberships_recently_changed**](DefaultApi.md#memberships_recently_changed) | **GET** /{format}/RecentlyChangedMemberships/{days} | Memberships (Recently Changed)
[**player**](DefaultApi.md#player) | **GET** /{format}/Player/{playerid} | Player
[**player_game_stats_by_date**](DefaultApi.md#player_game_stats_by_date) | **GET** /{format}/PlayerGameStatsByDate/{date} | Player Game Stats by Date
[**player_game_stats_by_player**](DefaultApi.md#player_game_stats_by_player) | **GET** /{format}/PlayerGameStatsByPlayer/{date}/{playerid} | Player Game Stats by Player
[**player_season_stats**](DefaultApi.md#player_season_stats) | **GET** /{format}/PlayerSeasonStats/{roundid} | Player Season Stats
[**player_season_stats_by_player**](DefaultApi.md#player_season_stats_by_player) | **GET** /{format}/PlayerSeasonStatsByPlayer/{roundid}/{playerid} | Player Season Stats by Player
[**player_season_stats_by_team**](DefaultApi.md#player_season_stats_by_team) | **GET** /{format}/PlayerSeasonStatsByTeam/{roundid}/{team} | Player Season Stats by Team
[**players**](DefaultApi.md#players) | **GET** /{format}/Players | Players
[**players_by_team**](DefaultApi.md#players_by_team) | **GET** /{format}/PlayersByTeam/{teamid} | Players by Team
[**schedule**](DefaultApi.md#schedule) | **GET** /{format}/Schedule/{roundid} | Schedule
[**season_teams**](DefaultApi.md#season_teams) | **GET** /{format}/SeasonTeams/{seasonid} | Season Teams
[**standings**](DefaultApi.md#standings) | **GET** /{format}/Standings/{roundid} | Standings
[**team_game_stats_by_date**](DefaultApi.md#team_game_stats_by_date) | **GET** /{format}/TeamGameStatsByDate/{date} | Team Game Stats by Date
[**team_season_stats**](DefaultApi.md#team_season_stats) | **GET** /{format}/TeamSeasonStats/{roundid} | Team Season Stats
[**teams**](DefaultApi.md#teams) | **GET** /{format}/Teams | Teams
[**upcoming_dfs_slates_by_competition**](DefaultApi.md#upcoming_dfs_slates_by_competition) | **GET** /{format}/UpcomingDfsSlatesByCompetition/{competitionId} | Upcoming Dfs Slates By Competition
[**upcoming_schedule_by_player**](DefaultApi.md#upcoming_schedule_by_player) | **GET** /{format}/UpcomingScheduleByPlayer/{playerid} | Upcoming Schedule By Player
[**venues**](DefaultApi.md#venues) | **GET** /{format}/Venues | Venues


# **areas_countries**
> List[Area] areas_countries(format)

Areas (Countries)

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.area import Area
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
        # Areas (Countries)
        api_response = api_instance.areas_countries(format)
        print("The response of DefaultApi->areas_countries:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->areas_countries: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]

### Return type

[**List[Area]**](Area.md)

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

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    gameid = 'gameid_example' # str | The GameID of a Soccer game.  GameIDs can be found in the Games API.  Valid entries are <code>702</code>, <code>1274</code>, etc.

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
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **gameid** | **str**| The GameID of a Soccer game.  GameIDs can be found in the Games API.  Valid entries are &lt;code&gt;702&lt;/code&gt;, &lt;code&gt;1274&lt;/code&gt;, etc. | 

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

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    var_date = 'var_date_example' # str | The date of the game(s). <br>Examples: <code>2017-02-27</code>, <code>2017-09-01</code>.

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
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **var_date** | **str**| The date of the game(s). &lt;br&gt;Examples: &lt;code&gt;2017-02-27&lt;/code&gt;, &lt;code&gt;2017-09-01&lt;/code&gt;. | 

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

# **box_scores_by_date_by_competition**
> List[BoxScore] box_scores_by_date_by_competition(format, competition, var_date)

Box Scores by Date by Competition

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.box_score import BoxScore
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    competition = 'competition_example' # str | An indication of a soccer competition/league. This value can be the CompetitionId or the Competition Key. Possible values include: <code>EPL</code>, <code>1</code>, <code>MLS</code>, <code>8</code>, etc.
    var_date = 'var_date_example' # str | The date of the game(s). <br>Examples: <code>2017-02-27</code>, <code>2017-09-01</code>.

    try:
        # Box Scores by Date by Competition
        api_response = api_instance.box_scores_by_date_by_competition(format, competition, var_date)
        print("The response of DefaultApi->box_scores_by_date_by_competition:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->box_scores_by_date_by_competition: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **competition** | **str**| An indication of a soccer competition/league. This value can be the CompetitionId or the Competition Key. Possible values include: &lt;code&gt;EPL&lt;/code&gt;, &lt;code&gt;1&lt;/code&gt;, &lt;code&gt;MLS&lt;/code&gt;, &lt;code&gt;8&lt;/code&gt;, etc. | 
 **var_date** | **str**| The date of the game(s). &lt;br&gt;Examples: &lt;code&gt;2017-02-27&lt;/code&gt;, &lt;code&gt;2017-09-01&lt;/code&gt;. | 

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

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    var_date = 'var_date_example' # str | The date of the game(s). <br>Examples: <code>2017-02-27</code>, <code>2017-09-01</code>.
    minutes = 'minutes_example' # str | Only returns player statistics that have changed in the last X minutes.  You specify how many minutes in time to go back. Valid entries are: <code>1</code>, <code>2</code> ... <code>all</code>.

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
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **var_date** | **str**| The date of the game(s). &lt;br&gt;Examples: &lt;code&gt;2017-02-27&lt;/code&gt;, &lt;code&gt;2017-09-01&lt;/code&gt;. | 
 **minutes** | **str**| Only returns player statistics that have changed in the last X minutes.  You specify how many minutes in time to go back. Valid entries are: &lt;code&gt;1&lt;/code&gt;, &lt;code&gt;2&lt;/code&gt; ... &lt;code&gt;all&lt;/code&gt;. | 

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

# **box_scores_delta_by_date_by_competition**
> List[BoxScore] box_scores_delta_by_date_by_competition(format, competition, var_date, minutes)

Box Scores Delta by Date by Competition

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.box_score import BoxScore
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    competition = 'competition_example' # str | An indication of a soccer competition/league. This value can be the CompetitionId or the Competition Key. Possible values include: <code>EPL</code>, <code>1</code>, <code>MLS</code>, <code>8</code>, etc.
    var_date = 'var_date_example' # str | The date of the game(s). <br>Examples: <code>2017-02-27</code>, <code>2017-09-01</code>.
    minutes = 'minutes_example' # str | Only returns player statistics that have changed in the last X minutes.  You specify how many minutes in time to go back. Valid entries are: <code>1</code>, <code>2</code> ... <code>all</code>.

    try:
        # Box Scores Delta by Date by Competition
        api_response = api_instance.box_scores_delta_by_date_by_competition(format, competition, var_date, minutes)
        print("The response of DefaultApi->box_scores_delta_by_date_by_competition:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->box_scores_delta_by_date_by_competition: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **competition** | **str**| An indication of a soccer competition/league. This value can be the CompetitionId or the Competition Key. Possible values include: &lt;code&gt;EPL&lt;/code&gt;, &lt;code&gt;1&lt;/code&gt;, &lt;code&gt;MLS&lt;/code&gt;, &lt;code&gt;8&lt;/code&gt;, etc. | 
 **var_date** | **str**| The date of the game(s). &lt;br&gt;Examples: &lt;code&gt;2017-02-27&lt;/code&gt;, &lt;code&gt;2017-09-01&lt;/code&gt;. | 
 **minutes** | **str**| Only returns player statistics that have changed in the last X minutes.  You specify how many minutes in time to go back. Valid entries are: &lt;code&gt;1&lt;/code&gt;, &lt;code&gt;2&lt;/code&gt; ... &lt;code&gt;all&lt;/code&gt;. | 

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

# **competition_fixtures_league_details**
> CompetitionDetail competition_fixtures_league_details(format, competition)

Competition Fixtures (League Details)

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.competition_detail import CompetitionDetail
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    competition = 'competition_example' # str | An indication of a soccer competition/league. This value can be the CompetitionId or the Competition Key. Possible values include: <code>EPL</code>, <code>1</code>, <code>MLS</code>, <code>8</code>, etc.

    try:
        # Competition Fixtures (League Details)
        api_response = api_instance.competition_fixtures_league_details(format, competition)
        print("The response of DefaultApi->competition_fixtures_league_details:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->competition_fixtures_league_details: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **competition** | **str**| An indication of a soccer competition/league. This value can be the CompetitionId or the Competition Key. Possible values include: &lt;code&gt;EPL&lt;/code&gt;, &lt;code&gt;1&lt;/code&gt;, &lt;code&gt;MLS&lt;/code&gt;, &lt;code&gt;8&lt;/code&gt;, etc. | 

### Return type

[**CompetitionDetail**](CompetitionDetail.md)

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

# **competition_hierarchy_league_hierarchy**
> List[Area] competition_hierarchy_league_hierarchy(format)

Competition Hierarchy (League Hierarchy)

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.area import Area
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
        # Competition Hierarchy (League Hierarchy)
        api_response = api_instance.competition_hierarchy_league_hierarchy(format)
        print("The response of DefaultApi->competition_hierarchy_league_hierarchy:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->competition_hierarchy_league_hierarchy: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]

### Return type

[**List[Area]**](Area.md)

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

# **competitions_leagues**
> List[Competition] competitions_leagues(format)

Competitions (Leagues)

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.competition import Competition
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
        # Competitions (Leagues)
        api_response = api_instance.competitions_leagues(format)
        print("The response of DefaultApi->competitions_leagues:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->competitions_leagues: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]

### Return type

[**List[Competition]**](Competition.md)

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

Dfs Slates By Date

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.dfs_slate import DfsSlate
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    var_date = 'var_date_example' # str | The date of the game(s). <br>Examples: <code>2020-02-18</code>.

    try:
        # Dfs Slates By Date
        api_response = api_instance.dfs_slates_by_date(format, var_date)
        print("The response of DefaultApi->dfs_slates_by_date:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->dfs_slates_by_date: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | 
 **var_date** | **str**| The date of the game(s). &lt;br&gt;Examples: &lt;code&gt;2020-02-18&lt;/code&gt;. | 

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

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    var_date = 'var_date_example' # str | The date of the game(s). <br>Examples: <code>2017-02-27</code>, <code>2017-09-01</code>.

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
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **var_date** | **str**| The date of the game(s). &lt;br&gt;Examples: &lt;code&gt;2017-02-27&lt;/code&gt;, &lt;code&gt;2017-09-01&lt;/code&gt;. | 

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

# **memberships_active**
> List[Membership] memberships_active(format)

Memberships (Active)

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.membership import Membership
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
        # Memberships (Active)
        api_response = api_instance.memberships_active(format)
        print("The response of DefaultApi->memberships_active:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->memberships_active: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]

### Return type

[**List[Membership]**](Membership.md)

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

# **memberships_by_competition_active**
> List[Membership] memberships_by_competition_active(format, competition)

Memberships by Competition (Active)

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.membership import Membership
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    competition = 'competition_example' # str | An indication of a soccer competition/league. This value can be the CompetitionId or the Competition Key. Possible values include: <code>EPL</code>, <code>1</code>, <code>MLS</code>, <code>8</code>, etc.

    try:
        # Memberships by Competition (Active)
        api_response = api_instance.memberships_by_competition_active(format, competition)
        print("The response of DefaultApi->memberships_by_competition_active:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->memberships_by_competition_active: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **competition** | **str**| An indication of a soccer competition/league. This value can be the CompetitionId or the Competition Key. Possible values include: &lt;code&gt;EPL&lt;/code&gt;, &lt;code&gt;1&lt;/code&gt;, &lt;code&gt;MLS&lt;/code&gt;, &lt;code&gt;8&lt;/code&gt;, etc. | 

### Return type

[**List[Membership]**](Membership.md)

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

# **memberships_by_competition_historical**
> List[Membership] memberships_by_competition_historical(format, competition)

Memberships by Competition (Historical)

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.membership import Membership
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    competition = 'competition_example' # str | An indication of a soccer competition/league. This value can be the CompetitionId or the Competition Key. Possible values include: <code>EPL</code>, <code>1</code>, <code>MLS</code>, <code>8</code>, etc.

    try:
        # Memberships by Competition (Historical)
        api_response = api_instance.memberships_by_competition_historical(format, competition)
        print("The response of DefaultApi->memberships_by_competition_historical:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->memberships_by_competition_historical: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **competition** | **str**| An indication of a soccer competition/league. This value can be the CompetitionId or the Competition Key. Possible values include: &lt;code&gt;EPL&lt;/code&gt;, &lt;code&gt;1&lt;/code&gt;, &lt;code&gt;MLS&lt;/code&gt;, &lt;code&gt;8&lt;/code&gt;, etc. | 

### Return type

[**List[Membership]**](Membership.md)

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

# **memberships_by_team_active**
> List[Membership] memberships_by_team_active(format, teamid)

Memberships by Team (Active)

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.membership import Membership
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    teamid = 'teamid_example' # str | Unique FantasyData Team ID.  Example:<code>516</code>.

    try:
        # Memberships by Team (Active)
        api_response = api_instance.memberships_by_team_active(format, teamid)
        print("The response of DefaultApi->memberships_by_team_active:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->memberships_by_team_active: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **teamid** | **str**| Unique FantasyData Team ID.  Example:&lt;code&gt;516&lt;/code&gt;. | 

### Return type

[**List[Membership]**](Membership.md)

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

# **memberships_by_team_historical**
> List[Membership] memberships_by_team_historical(format, teamid)

Memberships by Team (Historical)

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.membership import Membership
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    teamid = 'teamid_example' # str | Unique FantasyData Team ID.  Example:<code>516</code>.

    try:
        # Memberships by Team (Historical)
        api_response = api_instance.memberships_by_team_historical(format, teamid)
        print("The response of DefaultApi->memberships_by_team_historical:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->memberships_by_team_historical: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **teamid** | **str**| Unique FantasyData Team ID.  Example:&lt;code&gt;516&lt;/code&gt;. | 

### Return type

[**List[Membership]**](Membership.md)

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

# **memberships_historical**
> List[Membership] memberships_historical(format)

Memberships (Historical)

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.membership import Membership
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
        # Memberships (Historical)
        api_response = api_instance.memberships_historical(format)
        print("The response of DefaultApi->memberships_historical:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->memberships_historical: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]

### Return type

[**List[Membership]**](Membership.md)

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

# **memberships_recently_changed**
> List[Membership] memberships_recently_changed(format, days)

Memberships (Recently Changed)

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.membership import Membership
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    days = 'days_example' # str | The number of days since memberships were updated. For example, if you pass <code>3</code>, you'll receive all memberships that have been updated in the past 3 days. Valid entries are: <code>1</code>, <code>2</code> ... <code>30</code>

    try:
        # Memberships (Recently Changed)
        api_response = api_instance.memberships_recently_changed(format, days)
        print("The response of DefaultApi->memberships_recently_changed:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->memberships_recently_changed: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **days** | **str**| The number of days since memberships were updated. For example, if you pass &lt;code&gt;3&lt;/code&gt;, you&#39;ll receive all memberships that have been updated in the past 3 days. Valid entries are: &lt;code&gt;1&lt;/code&gt;, &lt;code&gt;2&lt;/code&gt; ... &lt;code&gt;30&lt;/code&gt; | 

### Return type

[**List[Membership]**](Membership.md)

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

# **player**
> Player player(format, playerid)

Player

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.player import Player
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    playerid = 'playerid_example' # str | Unique FantasyData Player ID. Example:<code>90026231</code>.

    try:
        # Player
        api_response = api_instance.player(format, playerid)
        print("The response of DefaultApi->player:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->player: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **playerid** | **str**| Unique FantasyData Player ID. Example:&lt;code&gt;90026231&lt;/code&gt;. | 

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

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    var_date = 'var_date_example' # str | The date of the game(s). <br>Examples: <code>2017-02-27</code>, <code>2017-09-01</code>.

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
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **var_date** | **str**| The date of the game(s). &lt;br&gt;Examples: &lt;code&gt;2017-02-27&lt;/code&gt;, &lt;code&gt;2017-09-01&lt;/code&gt;. | 

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
> List[PlayerGame] player_game_stats_by_player(format, var_date, playerid)

Player Game Stats by Player

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.player_game import PlayerGame
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    var_date = 'var_date_example' # str | The date of the game(s). <br>Examples: <code>2017-02-27</code>, <code>2017-09-01</code>.
    playerid = 'playerid_example' # str | Unique FantasyData Player ID. Example:<code>90026231</code>.

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
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **var_date** | **str**| The date of the game(s). &lt;br&gt;Examples: &lt;code&gt;2017-02-27&lt;/code&gt;, &lt;code&gt;2017-09-01&lt;/code&gt;. | 
 **playerid** | **str**| Unique FantasyData Player ID. Example:&lt;code&gt;90026231&lt;/code&gt;. | 

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

# **player_season_stats**
> List[PlayerSeason] player_season_stats(format, roundid)

Player Season Stats

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.player_season import PlayerSeason
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    roundid = 'roundid_example' # str | Unique FantasyData Round ID. RoundIDs can be found in the Competition Hierarchy (League Hierarchy).  Examples: <code>1</code>, <code>2</code>, <code>3</code>, etc

    try:
        # Player Season Stats
        api_response = api_instance.player_season_stats(format, roundid)
        print("The response of DefaultApi->player_season_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->player_season_stats: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **roundid** | **str**| Unique FantasyData Round ID. RoundIDs can be found in the Competition Hierarchy (League Hierarchy).  Examples: &lt;code&gt;1&lt;/code&gt;, &lt;code&gt;2&lt;/code&gt;, &lt;code&gt;3&lt;/code&gt;, etc | 

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
> List[PlayerSeason] player_season_stats_by_player(format, roundid, playerid)

Player Season Stats by Player

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.player_season import PlayerSeason
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    roundid = 'roundid_example' # str | Unique FantasyData Round ID. RoundIDs can be found in the Competition Hierarchy (League Hierarchy).  Examples: <code>1</code>, <code>2</code>, <code>3</code>, etc
    playerid = 'playerid_example' # str | Unique FantasyData Player ID. Example:<code>90026231</code>.

    try:
        # Player Season Stats by Player
        api_response = api_instance.player_season_stats_by_player(format, roundid, playerid)
        print("The response of DefaultApi->player_season_stats_by_player:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->player_season_stats_by_player: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **roundid** | **str**| Unique FantasyData Round ID. RoundIDs can be found in the Competition Hierarchy (League Hierarchy).  Examples: &lt;code&gt;1&lt;/code&gt;, &lt;code&gt;2&lt;/code&gt;, &lt;code&gt;3&lt;/code&gt;, etc | 
 **playerid** | **str**| Unique FantasyData Player ID. Example:&lt;code&gt;90026231&lt;/code&gt;. | 

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

# **player_season_stats_by_team**
> List[PlayerSeason] player_season_stats_by_team(format, roundid, team)

Player Season Stats by Team

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.player_season import PlayerSeason
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    roundid = 'roundid_example' # str | Unique FantasyData Round ID. RoundIDs can be found in the Competition Hierarchy (League Hierarchy).  Examples: <code>1</code>, <code>2</code>, <code>3</code>, etc
    team = 'team_example' # str | Unique FantasyData Team ID.  Example:<code>516</code>.

    try:
        # Player Season Stats by Team
        api_response = api_instance.player_season_stats_by_team(format, roundid, team)
        print("The response of DefaultApi->player_season_stats_by_team:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->player_season_stats_by_team: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **roundid** | **str**| Unique FantasyData Round ID. RoundIDs can be found in the Competition Hierarchy (League Hierarchy).  Examples: &lt;code&gt;1&lt;/code&gt;, &lt;code&gt;2&lt;/code&gt;, &lt;code&gt;3&lt;/code&gt;, etc | 
 **team** | **str**| Unique FantasyData Team ID.  Example:&lt;code&gt;516&lt;/code&gt;. | 

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

# **players**
> List[Player] players(format)

Players

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.player import Player
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
        # Players
        api_response = api_instance.players(format)
        print("The response of DefaultApi->players:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->players: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]

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

# **players_by_team**
> List[Player] players_by_team(format, teamid)

Players by Team

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.player import Player
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    teamid = 'teamid_example' # str | Unique FantasyData Team ID.  Example:<code>516</code>.

    try:
        # Players by Team
        api_response = api_instance.players_by_team(format, teamid)
        print("The response of DefaultApi->players_by_team:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->players_by_team: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **teamid** | **str**| Unique FantasyData Team ID.  Example:&lt;code&gt;516&lt;/code&gt;. | 

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

# **schedule**
> List[Game] schedule(format, roundid)

Schedule

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.game import Game
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    roundid = 'roundid_example' # str | Unique FantasyData Round ID. RoundIDs can be found in the Competition Hierarchy (League Hierarchy).  Examples: <code>1</code>, <code>2</code>, <code>3</code>, etc

    try:
        # Schedule
        api_response = api_instance.schedule(format, roundid)
        print("The response of DefaultApi->schedule:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->schedule: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **roundid** | **str**| Unique FantasyData Round ID. RoundIDs can be found in the Competition Hierarchy (League Hierarchy).  Examples: &lt;code&gt;1&lt;/code&gt;, &lt;code&gt;2&lt;/code&gt;, &lt;code&gt;3&lt;/code&gt;, etc | 

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

# **season_teams**
> List[SeasonTeam] season_teams(format, seasonid)

Season Teams

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.season_team import SeasonTeam
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    seasonid = 'seasonid_example' # str | Unique FantasyData Season ID. SeasonIDs can be found in the Competition Hierarchy (League Hierarchy).  Examples: <code>1</code>, <code>2</code>, <code>3</code>, etc

    try:
        # Season Teams
        api_response = api_instance.season_teams(format, seasonid)
        print("The response of DefaultApi->season_teams:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->season_teams: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **seasonid** | **str**| Unique FantasyData Season ID. SeasonIDs can be found in the Competition Hierarchy (League Hierarchy).  Examples: &lt;code&gt;1&lt;/code&gt;, &lt;code&gt;2&lt;/code&gt;, &lt;code&gt;3&lt;/code&gt;, etc | 

### Return type

[**List[SeasonTeam]**](SeasonTeam.md)

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
> List[Standing] standings(format, roundid)

Standings

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.standing import Standing
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    roundid = 'roundid_example' # str | Unique FantasyData Round ID. RoundIDs can be found in the Competition Hierarchy (League Hierarchy).  Examples: <code>1</code>, <code>2</code>, <code>3</code>, etc

    try:
        # Standings
        api_response = api_instance.standings(format, roundid)
        print("The response of DefaultApi->standings:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->standings: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **roundid** | **str**| Unique FantasyData Round ID. RoundIDs can be found in the Competition Hierarchy (League Hierarchy).  Examples: &lt;code&gt;1&lt;/code&gt;, &lt;code&gt;2&lt;/code&gt;, &lt;code&gt;3&lt;/code&gt;, etc | 

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

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    var_date = 'var_date_example' # str | The date of the game(s). <br>Examples: <code>2017-02-27</code>, <code>2017-09-01</code>.

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
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **var_date** | **str**| The date of the game(s). &lt;br&gt;Examples: &lt;code&gt;2017-02-27&lt;/code&gt;, &lt;code&gt;2017-09-01&lt;/code&gt;. | 

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
> List[TeamSeason] team_season_stats(format, roundid)

Team Season Stats

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.team_season import TeamSeason
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    roundid = 'roundid_example' # str | Unique FantasyData Round ID. RoundIDs can be found in the Competition Hierarchy (League Hierarchy).  Examples: <code>1</code>, <code>2</code>, <code>3</code>, etc

    try:
        # Team Season Stats
        api_response = api_instance.team_season_stats(format, roundid)
        print("The response of DefaultApi->team_season_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->team_season_stats: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **roundid** | **str**| Unique FantasyData Round ID. RoundIDs can be found in the Competition Hierarchy (League Hierarchy).  Examples: &lt;code&gt;1&lt;/code&gt;, &lt;code&gt;2&lt;/code&gt;, &lt;code&gt;3&lt;/code&gt;, etc | 

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

# **teams**
> List[Team] teams(format)

Teams

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.team import Team
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
        # Teams
        api_response = api_instance.teams(format)
        print("The response of DefaultApi->teams:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->teams: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]

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

# **upcoming_dfs_slates_by_competition**
> List[DfsSlate] upcoming_dfs_slates_by_competition(format, competition_id)

Upcoming Dfs Slates By Competition

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.dfs_slate import DfsSlate
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    competition_id = 'competition_id_example' # str | The id of the competition. <br>Examples: <code>3</code>

    try:
        # Upcoming Dfs Slates By Competition
        api_response = api_instance.upcoming_dfs_slates_by_competition(format, competition_id)
        print("The response of DefaultApi->upcoming_dfs_slates_by_competition:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->upcoming_dfs_slates_by_competition: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | 
 **competition_id** | **str**| The id of the competition. &lt;br&gt;Examples: &lt;code&gt;3&lt;/code&gt; | 

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

# **upcoming_schedule_by_player**
> List[Game] upcoming_schedule_by_player(format, playerid)

Upcoming Schedule By Player

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.game import Game
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
    playerid = 'playerid_example' # str | Unique FantasyData Player ID. Example:<code>90026231</code>.

    try:
        # Upcoming Schedule By Player
        api_response = api_instance.upcoming_schedule_by_player(format, playerid)
        print("The response of DefaultApi->upcoming_schedule_by_player:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->upcoming_schedule_by_player: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]
 **playerid** | **str**| Unique FantasyData Player ID. Example:&lt;code&gt;90026231&lt;/code&gt;. | 

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

# **venues**
> List[Venue] venues(format)

Venues

### Example

* Api Key Authentication (apiKeyQuery):
* Api Key Authentication (apiKeyHeader):

```python
import openapi_client
from openapi_client.models.venue import Venue
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://azure-api.sportsdata.io/v3/soccer/stats
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://azure-api.sportsdata.io/v3/soccer/stats"
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
        # Venues
        api_response = api_instance.venues(format)
        print("The response of DefaultApi->venues:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->venues: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Desired response format. Valid entries are &lt;code&gt;XML&lt;/code&gt; or &lt;code&gt;JSON&lt;/code&gt;. | [default to xml]

### Return type

[**List[Venue]**](Venue.md)

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

