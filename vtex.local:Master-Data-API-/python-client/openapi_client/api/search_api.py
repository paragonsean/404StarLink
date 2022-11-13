# coding: utf-8

"""
    Master Data API - v2

    # ATTENTION: **This version isn't compliant with data entities of old version (e.g. CL and AD). It's possible to use this configuration only to new data entities.**      ## Welcome!    VTEX Master Data is an easy-to-use, secure, fast, scalable and extensible repository. On it you can create your own Entities, store data and consult directly from the storefront or use it to store info for some external integration.    There are internal VTEX modules that use VTEX Master Data as data repository. We have the VTEX Customer Service, VTEX Profile System and VTEX InStore, for example. It is also used by other internal services.    There are two ways to use Master Data:    1. Directly from the storefront  2. External integration    ### Directly from the storefront    If your scenario is to be used inside the storefront, be aware of the following observations:    1. Use the storefront host to query or store information to avoid **CORS**;  2. Configure which information should be public and which shouldn't, inside the JSON Schema of the Data Entity;  3. Do not create query loops (the storefront may be affected with Throttling and apis may be turned off as a security protection);  4. Never add via JS any type of authentication key (x-vtex-api-appkey or x-vtex-api-apptoken);    **It's important to avoid CORS using the relative path**    ### External Integration    If your scenario is to perform external integration, such as migrating client data from another service, be aware of the following observations:    1. Use the host ```{{accountName}}.vtexcommercestable.com.br```;  2. Use the authentication keys (x-vtex-api-appkey ou x-vtex-api-apptoken);    ### Most used attributes listed here    | Name | Description |  | -------- | -------- |  | accountName | Account name in VTEX License Manager |  | name | Data Entity name |  | schema | JSON Schema of a Data Entity |  | id | Identifier of a document |  | x-vtex-api-appKey | User key |  | x-vtex-api-appToken | User token |

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501

import warnings
from pydantic import validate_call, Field, StrictFloat, StrictStr, StrictInt
from typing import Any, Dict, List, Optional, Tuple, Union
from typing_extensions import Annotated

from pydantic import Field, StrictStr
from typing import Optional
from typing_extensions import Annotated

from openapi_client.api_client import ApiClient, RequestSerialized
from openapi_client.api_response import ApiResponse
from openapi_client.rest import RESTResponseType


class SearchApi:
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None) -> None:
        if api_client is None:
            api_client = ApiClient.get_default()
        self.api_client = api_client


    @validate_call
    def searchdocuments(
        self,
        data_entity_name: Annotated[StrictStr, Field(description="Name of the data entity. Defined by the api. Examples of native data entities you can use are `CL` for client profiles and `AD` for client addresses.")],
        content_type: Annotated[StrictStr, Field(description="Type of the content being sent.")],
        accept: Annotated[StrictStr, Field(description="HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.")],
        rest_range: Annotated[StrictStr, Field(description="Defines the collection of documents to be returned. A range within the collection limited by 100 documents per query.")],
        fields: Annotated[Optional[StrictStr], Field(description="Fields that should be returned by document. Separate fields' names with commas. For example `_fields=email,firstName,document`. You can also use `_all` to fetch all fields.")] = None,
        where: Annotated[Optional[StrictStr], Field(description="Filter specification.")] = None,
        var_schema: Annotated[Optional[StrictStr], Field(description="Name of the schema the document to be created needs to be compliant with.")] = None,
        keyword: Annotated[Optional[StrictStr], Field(description="String to search. Use quotes for a partial query. For example, `_keyword=Maria` or `_keyword=\"Maria\"`.")] = None,
        sort: Annotated[Optional[StrictStr], Field(description="Sets sorting mode in two parts. The first part is the name of the field you want to sort by. In the second part, use `ASC` for ascending or `DESC` for descending.")] = None,
        _request_timeout: Union[
            None,
            Annotated[StrictFloat, Field(gt=0)],
            Tuple[
                Annotated[StrictFloat, Field(gt=0)],
                Annotated[StrictFloat, Field(gt=0)]
            ]
        ] = None,
        _request_auth: Optional[Dict[StrictStr, Any]] = None,
        _content_type: Optional[StrictStr] = None,
        _headers: Optional[Dict[StrictStr, Any]] = None,
        _host_index: Annotated[StrictInt, Field(ge=0, le=0)] = 0,
    ) -> None:
        """Search documents

        Retrieves documents' information, while choosing which fields will be returned and filtering documents by specific fields.    > The response header `REST-Content-Range` indicates the total amount of results for that specific search. For example, it may return `resources 0-100/136108`, which indicates it has returned results from 0 to 100 of a total 136108.    Below you can see some query examples and learn more about each query parameter.    > Avoid sending too many requests with wildcards (`*`) in the search parameters or that use the `keyword` parameter. This may lead to this endpoint being temporarily blocked for your account. If this happens you will receive an error with status code `503`.    ## Query examples    ### Simple filter    ```  /dataentities/Client/search?email=my@email.com  ```    ### Complex filter    ```  /dataentities/Client/search?_where=(firstName=Jon OR lastName=Smith) OR (createdIn between 2001-01-01 AND 2016-01-01)  ```    ### Date Range    ```  /dataentities/Client/search?_where=createdIn between 2001-01-01 AND 2016-01-01  ```    ### Range numeric fields    ```  /dataentities/Client/search?_where=age between 18 AND 25  ```    ### Partial filter    ```  /dataentities/Client/search?firstName=*Maria*  ```    ### Filter for null values    ```  /dataentities/Client/search?_where=firstName is null  ```    ### Filter for non-null values    ```  /dataentities/Client/search?_where=firstName is not null  ```    ### Filter for difference  ```  /dataentities/Client/search?_where=firstName<>maria  ```    ### Filter greater than or less than  ```  /dataentities/Client/search?_where=number>5  /dataentities/Client/search?_where=date<2001-01-01  ```

        :param data_entity_name: Name of the data entity. Defined by the api. Examples of native data entities you can use are `CL` for client profiles and `AD` for client addresses. (required)
        :type data_entity_name: str
        :param content_type: Type of the content being sent. (required)
        :type content_type: str
        :param accept: HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand. (required)
        :type accept: str
        :param rest_range: Defines the collection of documents to be returned. A range within the collection limited by 100 documents per query. (required)
        :type rest_range: str
        :param fields: Fields that should be returned by document. Separate fields' names with commas. For example `_fields=email,firstName,document`. You can also use `_all` to fetch all fields.
        :type fields: str
        :param where: Filter specification.
        :type where: str
        :param var_schema: Name of the schema the document to be created needs to be compliant with.
        :type var_schema: str
        :param keyword: String to search. Use quotes for a partial query. For example, `_keyword=Maria` or `_keyword=\"Maria\"`.
        :type keyword: str
        :param sort: Sets sorting mode in two parts. The first part is the name of the field you want to sort by. In the second part, use `ASC` for ascending or `DESC` for descending.
        :type sort: str
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :type _request_timeout: int, tuple(int, int), optional
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the
                              authentication in the spec for a single request.
        :type _request_auth: dict, optional
        :param _content_type: force content-type for the request.
        :type _content_type: str, Optional
        :param _headers: set to override the headers for a single
                         request; this effectively ignores the headers
                         in the spec for a single request.
        :type _headers: dict, optional
        :param _host_index: set to override the host_index for a single
                            request; this effectively ignores the host_index
                            in the spec for a single request.
        :type _host_index: int, optional
        :return: Returns the result object.
        """ # noqa: E501

        _param = self._searchdocuments_serialize(
            data_entity_name=data_entity_name,
            content_type=content_type,
            accept=accept,
            rest_range=rest_range,
            fields=fields,
            where=where,
            var_schema=var_schema,
            keyword=keyword,
            sort=sort,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': None,
            '503': "object",
        }
        response_data = self.api_client.call_api(
            *_param,
            _request_timeout=_request_timeout
        )
        response_data.read()
        return self.api_client.response_deserialize(
            response_data=response_data,
            response_types_map=_response_types_map,
        ).data


    @validate_call
    def searchdocuments_with_http_info(
        self,
        data_entity_name: Annotated[StrictStr, Field(description="Name of the data entity. Defined by the api. Examples of native data entities you can use are `CL` for client profiles and `AD` for client addresses.")],
        content_type: Annotated[StrictStr, Field(description="Type of the content being sent.")],
        accept: Annotated[StrictStr, Field(description="HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.")],
        rest_range: Annotated[StrictStr, Field(description="Defines the collection of documents to be returned. A range within the collection limited by 100 documents per query.")],
        fields: Annotated[Optional[StrictStr], Field(description="Fields that should be returned by document. Separate fields' names with commas. For example `_fields=email,firstName,document`. You can also use `_all` to fetch all fields.")] = None,
        where: Annotated[Optional[StrictStr], Field(description="Filter specification.")] = None,
        var_schema: Annotated[Optional[StrictStr], Field(description="Name of the schema the document to be created needs to be compliant with.")] = None,
        keyword: Annotated[Optional[StrictStr], Field(description="String to search. Use quotes for a partial query. For example, `_keyword=Maria` or `_keyword=\"Maria\"`.")] = None,
        sort: Annotated[Optional[StrictStr], Field(description="Sets sorting mode in two parts. The first part is the name of the field you want to sort by. In the second part, use `ASC` for ascending or `DESC` for descending.")] = None,
        _request_timeout: Union[
            None,
            Annotated[StrictFloat, Field(gt=0)],
            Tuple[
                Annotated[StrictFloat, Field(gt=0)],
                Annotated[StrictFloat, Field(gt=0)]
            ]
        ] = None,
        _request_auth: Optional[Dict[StrictStr, Any]] = None,
        _content_type: Optional[StrictStr] = None,
        _headers: Optional[Dict[StrictStr, Any]] = None,
        _host_index: Annotated[StrictInt, Field(ge=0, le=0)] = 0,
    ) -> ApiResponse[None]:
        """Search documents

        Retrieves documents' information, while choosing which fields will be returned and filtering documents by specific fields.    > The response header `REST-Content-Range` indicates the total amount of results for that specific search. For example, it may return `resources 0-100/136108`, which indicates it has returned results from 0 to 100 of a total 136108.    Below you can see some query examples and learn more about each query parameter.    > Avoid sending too many requests with wildcards (`*`) in the search parameters or that use the `keyword` parameter. This may lead to this endpoint being temporarily blocked for your account. If this happens you will receive an error with status code `503`.    ## Query examples    ### Simple filter    ```  /dataentities/Client/search?email=my@email.com  ```    ### Complex filter    ```  /dataentities/Client/search?_where=(firstName=Jon OR lastName=Smith) OR (createdIn between 2001-01-01 AND 2016-01-01)  ```    ### Date Range    ```  /dataentities/Client/search?_where=createdIn between 2001-01-01 AND 2016-01-01  ```    ### Range numeric fields    ```  /dataentities/Client/search?_where=age between 18 AND 25  ```    ### Partial filter    ```  /dataentities/Client/search?firstName=*Maria*  ```    ### Filter for null values    ```  /dataentities/Client/search?_where=firstName is null  ```    ### Filter for non-null values    ```  /dataentities/Client/search?_where=firstName is not null  ```    ### Filter for difference  ```  /dataentities/Client/search?_where=firstName<>maria  ```    ### Filter greater than or less than  ```  /dataentities/Client/search?_where=number>5  /dataentities/Client/search?_where=date<2001-01-01  ```

        :param data_entity_name: Name of the data entity. Defined by the api. Examples of native data entities you can use are `CL` for client profiles and `AD` for client addresses. (required)
        :type data_entity_name: str
        :param content_type: Type of the content being sent. (required)
        :type content_type: str
        :param accept: HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand. (required)
        :type accept: str
        :param rest_range: Defines the collection of documents to be returned. A range within the collection limited by 100 documents per query. (required)
        :type rest_range: str
        :param fields: Fields that should be returned by document. Separate fields' names with commas. For example `_fields=email,firstName,document`. You can also use `_all` to fetch all fields.
        :type fields: str
        :param where: Filter specification.
        :type where: str
        :param var_schema: Name of the schema the document to be created needs to be compliant with.
        :type var_schema: str
        :param keyword: String to search. Use quotes for a partial query. For example, `_keyword=Maria` or `_keyword=\"Maria\"`.
        :type keyword: str
        :param sort: Sets sorting mode in two parts. The first part is the name of the field you want to sort by. In the second part, use `ASC` for ascending or `DESC` for descending.
        :type sort: str
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :type _request_timeout: int, tuple(int, int), optional
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the
                              authentication in the spec for a single request.
        :type _request_auth: dict, optional
        :param _content_type: force content-type for the request.
        :type _content_type: str, Optional
        :param _headers: set to override the headers for a single
                         request; this effectively ignores the headers
                         in the spec for a single request.
        :type _headers: dict, optional
        :param _host_index: set to override the host_index for a single
                            request; this effectively ignores the host_index
                            in the spec for a single request.
        :type _host_index: int, optional
        :return: Returns the result object.
        """ # noqa: E501

        _param = self._searchdocuments_serialize(
            data_entity_name=data_entity_name,
            content_type=content_type,
            accept=accept,
            rest_range=rest_range,
            fields=fields,
            where=where,
            var_schema=var_schema,
            keyword=keyword,
            sort=sort,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': None,
            '503': "object",
        }
        response_data = self.api_client.call_api(
            *_param,
            _request_timeout=_request_timeout
        )
        response_data.read()
        return self.api_client.response_deserialize(
            response_data=response_data,
            response_types_map=_response_types_map,
        )


    @validate_call
    def searchdocuments_without_preload_content(
        self,
        data_entity_name: Annotated[StrictStr, Field(description="Name of the data entity. Defined by the api. Examples of native data entities you can use are `CL` for client profiles and `AD` for client addresses.")],
        content_type: Annotated[StrictStr, Field(description="Type of the content being sent.")],
        accept: Annotated[StrictStr, Field(description="HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.")],
        rest_range: Annotated[StrictStr, Field(description="Defines the collection of documents to be returned. A range within the collection limited by 100 documents per query.")],
        fields: Annotated[Optional[StrictStr], Field(description="Fields that should be returned by document. Separate fields' names with commas. For example `_fields=email,firstName,document`. You can also use `_all` to fetch all fields.")] = None,
        where: Annotated[Optional[StrictStr], Field(description="Filter specification.")] = None,
        var_schema: Annotated[Optional[StrictStr], Field(description="Name of the schema the document to be created needs to be compliant with.")] = None,
        keyword: Annotated[Optional[StrictStr], Field(description="String to search. Use quotes for a partial query. For example, `_keyword=Maria` or `_keyword=\"Maria\"`.")] = None,
        sort: Annotated[Optional[StrictStr], Field(description="Sets sorting mode in two parts. The first part is the name of the field you want to sort by. In the second part, use `ASC` for ascending or `DESC` for descending.")] = None,
        _request_timeout: Union[
            None,
            Annotated[StrictFloat, Field(gt=0)],
            Tuple[
                Annotated[StrictFloat, Field(gt=0)],
                Annotated[StrictFloat, Field(gt=0)]
            ]
        ] = None,
        _request_auth: Optional[Dict[StrictStr, Any]] = None,
        _content_type: Optional[StrictStr] = None,
        _headers: Optional[Dict[StrictStr, Any]] = None,
        _host_index: Annotated[StrictInt, Field(ge=0, le=0)] = 0,
    ) -> RESTResponseType:
        """Search documents

        Retrieves documents' information, while choosing which fields will be returned and filtering documents by specific fields.    > The response header `REST-Content-Range` indicates the total amount of results for that specific search. For example, it may return `resources 0-100/136108`, which indicates it has returned results from 0 to 100 of a total 136108.    Below you can see some query examples and learn more about each query parameter.    > Avoid sending too many requests with wildcards (`*`) in the search parameters or that use the `keyword` parameter. This may lead to this endpoint being temporarily blocked for your account. If this happens you will receive an error with status code `503`.    ## Query examples    ### Simple filter    ```  /dataentities/Client/search?email=my@email.com  ```    ### Complex filter    ```  /dataentities/Client/search?_where=(firstName=Jon OR lastName=Smith) OR (createdIn between 2001-01-01 AND 2016-01-01)  ```    ### Date Range    ```  /dataentities/Client/search?_where=createdIn between 2001-01-01 AND 2016-01-01  ```    ### Range numeric fields    ```  /dataentities/Client/search?_where=age between 18 AND 25  ```    ### Partial filter    ```  /dataentities/Client/search?firstName=*Maria*  ```    ### Filter for null values    ```  /dataentities/Client/search?_where=firstName is null  ```    ### Filter for non-null values    ```  /dataentities/Client/search?_where=firstName is not null  ```    ### Filter for difference  ```  /dataentities/Client/search?_where=firstName<>maria  ```    ### Filter greater than or less than  ```  /dataentities/Client/search?_where=number>5  /dataentities/Client/search?_where=date<2001-01-01  ```

        :param data_entity_name: Name of the data entity. Defined by the api. Examples of native data entities you can use are `CL` for client profiles and `AD` for client addresses. (required)
        :type data_entity_name: str
        :param content_type: Type of the content being sent. (required)
        :type content_type: str
        :param accept: HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand. (required)
        :type accept: str
        :param rest_range: Defines the collection of documents to be returned. A range within the collection limited by 100 documents per query. (required)
        :type rest_range: str
        :param fields: Fields that should be returned by document. Separate fields' names with commas. For example `_fields=email,firstName,document`. You can also use `_all` to fetch all fields.
        :type fields: str
        :param where: Filter specification.
        :type where: str
        :param var_schema: Name of the schema the document to be created needs to be compliant with.
        :type var_schema: str
        :param keyword: String to search. Use quotes for a partial query. For example, `_keyword=Maria` or `_keyword=\"Maria\"`.
        :type keyword: str
        :param sort: Sets sorting mode in two parts. The first part is the name of the field you want to sort by. In the second part, use `ASC` for ascending or `DESC` for descending.
        :type sort: str
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :type _request_timeout: int, tuple(int, int), optional
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the
                              authentication in the spec for a single request.
        :type _request_auth: dict, optional
        :param _content_type: force content-type for the request.
        :type _content_type: str, Optional
        :param _headers: set to override the headers for a single
                         request; this effectively ignores the headers
                         in the spec for a single request.
        :type _headers: dict, optional
        :param _host_index: set to override the host_index for a single
                            request; this effectively ignores the host_index
                            in the spec for a single request.
        :type _host_index: int, optional
        :return: Returns the result object.
        """ # noqa: E501

        _param = self._searchdocuments_serialize(
            data_entity_name=data_entity_name,
            content_type=content_type,
            accept=accept,
            rest_range=rest_range,
            fields=fields,
            where=where,
            var_schema=var_schema,
            keyword=keyword,
            sort=sort,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': None,
            '503': "object",
        }
        response_data = self.api_client.call_api(
            *_param,
            _request_timeout=_request_timeout
        )
        return response_data.response


    def _searchdocuments_serialize(
        self,
        data_entity_name,
        content_type,
        accept,
        rest_range,
        fields,
        where,
        var_schema,
        keyword,
        sort,
        _request_auth,
        _content_type,
        _headers,
        _host_index,
    ) -> RequestSerialized:

        _host = None

        _collection_formats: Dict[str, str] = {
        }

        _path_params: Dict[str, str] = {}
        _query_params: List[Tuple[str, str]] = []
        _header_params: Dict[str, Optional[str]] = _headers or {}
        _form_params: List[Tuple[str, str]] = []
        _files: Dict[
            str, Union[str, bytes, List[str], List[bytes], List[Tuple[str, bytes]]]
        ] = {}
        _body_params: Optional[bytes] = None

        # process the path parameters
        if data_entity_name is not None:
            _path_params['dataEntityName'] = data_entity_name
        # process the query parameters
        if fields is not None:
            
            _query_params.append(('_fields', fields))
            
        if where is not None:
            
            _query_params.append(('_where', where))
            
        if var_schema is not None:
            
            _query_params.append(('_schema', var_schema))
            
        if keyword is not None:
            
            _query_params.append(('_keyword', keyword))
            
        if sort is not None:
            
            _query_params.append(('_sort', sort))
            
        # process the header parameters
        if content_type is not None:
            _header_params['Content-Type'] = content_type
        if accept is not None:
            _header_params['Accept'] = accept
        if rest_range is not None:
            _header_params['REST-Range'] = rest_range
        # process the form parameters
        # process the body parameter


        # set the HTTP header `Accept`
        if 'Accept' not in _header_params:
            _header_params['Accept'] = self.api_client.select_header_accept(
                [
                    'application/json'
                ]
            )


        # authentication setting
        _auth_settings: List[str] = [
            'appToken', 
            'appKey'
        ]

        return self.api_client.param_serialize(
            method='GET',
            resource_path='/api/dataentities/{dataEntityName}/search',
            path_params=_path_params,
            query_params=_query_params,
            header_params=_header_params,
            body=_body_params,
            post_params=_form_params,
            files=_files,
            auth_settings=_auth_settings,
            collection_formats=_collection_formats,
            _host=_host,
            _request_auth=_request_auth
        )


