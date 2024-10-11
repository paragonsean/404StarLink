# coding: utf-8

"""
    Arespass

    Analyzes a password and calculates its entropy.

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501

import warnings
from pydantic import validate_call, Field, StrictFloat, StrictStr, StrictInt
from typing import Any, Dict, List, Optional, Tuple, Union
from typing_extensions import Annotated

from pydantic import Field, StrictFloat, StrictInt, StrictStr
from typing import Optional, Union
from typing_extensions import Annotated
from openapi_client.models.about import About
from openapi_client.models.ec import Ec

from openapi_client.api_client import ApiClient, RequestSerialized
from openapi_client.api_response import ApiResponse
from openapi_client.rest import RESTResponseType


class DefaultApi:
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None) -> None:
        if api_client is None:
            api_client = ApiClient.get_default()
        self.api_client = api_client


    @validate_call
    def about_get(
        self,
        output_format: Annotated[Optional[StrictStr], Field(description="**The format of the returned metadata.**  Allowed values are *json*, *xml* and *yaml*.  The default value is *xml*. ")] = None,
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
    ) -> About:
        """Metadata about this API&#58; version number, release date and available languages.  Metadata requests are NOT billed. 


        :param output_format: **The format of the returned metadata.**  Allowed values are *json*, *xml* and *yaml*.  The default value is *xml*. 
        :type output_format: str
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

        _param = self._about_get_serialize(
            output_format=output_format,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': "About",
            '400': None,
            '405': None,
            '500': None,
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
    def about_get_with_http_info(
        self,
        output_format: Annotated[Optional[StrictStr], Field(description="**The format of the returned metadata.**  Allowed values are *json*, *xml* and *yaml*.  The default value is *xml*. ")] = None,
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
    ) -> ApiResponse[About]:
        """Metadata about this API&#58; version number, release date and available languages.  Metadata requests are NOT billed. 


        :param output_format: **The format of the returned metadata.**  Allowed values are *json*, *xml* and *yaml*.  The default value is *xml*. 
        :type output_format: str
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

        _param = self._about_get_serialize(
            output_format=output_format,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': "About",
            '400': None,
            '405': None,
            '500': None,
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
    def about_get_without_preload_content(
        self,
        output_format: Annotated[Optional[StrictStr], Field(description="**The format of the returned metadata.**  Allowed values are *json*, *xml* and *yaml*.  The default value is *xml*. ")] = None,
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
        """Metadata about this API&#58; version number, release date and available languages.  Metadata requests are NOT billed. 


        :param output_format: **The format of the returned metadata.**  Allowed values are *json*, *xml* and *yaml*.  The default value is *xml*. 
        :type output_format: str
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

        _param = self._about_get_serialize(
            output_format=output_format,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': "About",
            '400': None,
            '405': None,
            '500': None,
        }
        response_data = self.api_client.call_api(
            *_param,
            _request_timeout=_request_timeout
        )
        return response_data.response


    def _about_get_serialize(
        self,
        output_format,
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
        # process the query parameters
        if output_format is not None:
            
            _query_params.append(('outputFormat', output_format))
            
        # process the header parameters
        # process the form parameters
        # process the body parameter


        # set the HTTP header `Accept`
        if 'Accept' not in _header_params:
            _header_params['Accept'] = self.api_client.select_header_accept(
                [
                    'application/json', 
                    'application/x-yaml', 
                    'application/xml'
                ]
            )


        # authentication setting
        _auth_settings: List[str] = [
        ]

        return self.api_client.param_serialize(
            method='GET',
            resource_path='/about',
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




    @validate_call
    def ec_get(
        self,
        password: Annotated[StrictStr, Field(description="**The password to be analyzed.**  Minimum length is 4 characters; maximum length is 128 characters.  Beware that certain characters like '&#35;', '&#61;' or '&#63;' must be properly encoded.  For more information about this issue, please refer to RFC 3986 (\"*Uniform Resource Identifier (URI): Generic Syntax*\"), sections 2.1, 2.2 and 2.4. ")],
        output_format: Annotated[Optional[StrictStr], Field(description="**The format of the returned analysis.**  Allowed values are *json*, *xml* and *yaml*.  The default value is *xml*. ")] = None,
        penalty: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="**The penalty applied to each character that is part of a word, number sequence, alphabet sequence, etc.**  The penalty is a float number in the range [0, 1]. Full penalty, 0; no penalty, 1.  The character used as decimal separator is always '&#46;'. Hence, a parameter value like *0,33* would be illegal.  The default value is *0.25*. ")] = None,
        req_id: Annotated[Optional[StrictStr], Field(description="**An identifier for this request.**  The request identifier is a string that must match the regular expression */(?i)^[a-z0-9]{8,16}$/*.  This identifier is echoed in the returned response. Its value has no effect on the password analysis.  If this parameter is unset, a randomly generated identifier will be automatically assigned to this request. ")] = None,
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
    ) -> Ec:
        """The entropy calculator - alias ec -, analyzes a password and calculates its entropy.  Entropy calculator requests are billed. 


        :param password: **The password to be analyzed.**  Minimum length is 4 characters; maximum length is 128 characters.  Beware that certain characters like '&#35;', '&#61;' or '&#63;' must be properly encoded.  For more information about this issue, please refer to RFC 3986 (\"*Uniform Resource Identifier (URI): Generic Syntax*\"), sections 2.1, 2.2 and 2.4.  (required)
        :type password: str
        :param output_format: **The format of the returned analysis.**  Allowed values are *json*, *xml* and *yaml*.  The default value is *xml*. 
        :type output_format: str
        :param penalty: **The penalty applied to each character that is part of a word, number sequence, alphabet sequence, etc.**  The penalty is a float number in the range [0, 1]. Full penalty, 0; no penalty, 1.  The character used as decimal separator is always '&#46;'. Hence, a parameter value like *0,33* would be illegal.  The default value is *0.25*. 
        :type penalty: float
        :param req_id: **An identifier for this request.**  The request identifier is a string that must match the regular expression */(?i)^[a-z0-9]{8,16}$/*.  This identifier is echoed in the returned response. Its value has no effect on the password analysis.  If this parameter is unset, a randomly generated identifier will be automatically assigned to this request. 
        :type req_id: str
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

        _param = self._ec_get_serialize(
            password=password,
            output_format=output_format,
            penalty=penalty,
            req_id=req_id,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': "Ec",
            '400': None,
            '405': None,
            '500': None,
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
    def ec_get_with_http_info(
        self,
        password: Annotated[StrictStr, Field(description="**The password to be analyzed.**  Minimum length is 4 characters; maximum length is 128 characters.  Beware that certain characters like '&#35;', '&#61;' or '&#63;' must be properly encoded.  For more information about this issue, please refer to RFC 3986 (\"*Uniform Resource Identifier (URI): Generic Syntax*\"), sections 2.1, 2.2 and 2.4. ")],
        output_format: Annotated[Optional[StrictStr], Field(description="**The format of the returned analysis.**  Allowed values are *json*, *xml* and *yaml*.  The default value is *xml*. ")] = None,
        penalty: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="**The penalty applied to each character that is part of a word, number sequence, alphabet sequence, etc.**  The penalty is a float number in the range [0, 1]. Full penalty, 0; no penalty, 1.  The character used as decimal separator is always '&#46;'. Hence, a parameter value like *0,33* would be illegal.  The default value is *0.25*. ")] = None,
        req_id: Annotated[Optional[StrictStr], Field(description="**An identifier for this request.**  The request identifier is a string that must match the regular expression */(?i)^[a-z0-9]{8,16}$/*.  This identifier is echoed in the returned response. Its value has no effect on the password analysis.  If this parameter is unset, a randomly generated identifier will be automatically assigned to this request. ")] = None,
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
    ) -> ApiResponse[Ec]:
        """The entropy calculator - alias ec -, analyzes a password and calculates its entropy.  Entropy calculator requests are billed. 


        :param password: **The password to be analyzed.**  Minimum length is 4 characters; maximum length is 128 characters.  Beware that certain characters like '&#35;', '&#61;' or '&#63;' must be properly encoded.  For more information about this issue, please refer to RFC 3986 (\"*Uniform Resource Identifier (URI): Generic Syntax*\"), sections 2.1, 2.2 and 2.4.  (required)
        :type password: str
        :param output_format: **The format of the returned analysis.**  Allowed values are *json*, *xml* and *yaml*.  The default value is *xml*. 
        :type output_format: str
        :param penalty: **The penalty applied to each character that is part of a word, number sequence, alphabet sequence, etc.**  The penalty is a float number in the range [0, 1]. Full penalty, 0; no penalty, 1.  The character used as decimal separator is always '&#46;'. Hence, a parameter value like *0,33* would be illegal.  The default value is *0.25*. 
        :type penalty: float
        :param req_id: **An identifier for this request.**  The request identifier is a string that must match the regular expression */(?i)^[a-z0-9]{8,16}$/*.  This identifier is echoed in the returned response. Its value has no effect on the password analysis.  If this parameter is unset, a randomly generated identifier will be automatically assigned to this request. 
        :type req_id: str
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

        _param = self._ec_get_serialize(
            password=password,
            output_format=output_format,
            penalty=penalty,
            req_id=req_id,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': "Ec",
            '400': None,
            '405': None,
            '500': None,
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
    def ec_get_without_preload_content(
        self,
        password: Annotated[StrictStr, Field(description="**The password to be analyzed.**  Minimum length is 4 characters; maximum length is 128 characters.  Beware that certain characters like '&#35;', '&#61;' or '&#63;' must be properly encoded.  For more information about this issue, please refer to RFC 3986 (\"*Uniform Resource Identifier (URI): Generic Syntax*\"), sections 2.1, 2.2 and 2.4. ")],
        output_format: Annotated[Optional[StrictStr], Field(description="**The format of the returned analysis.**  Allowed values are *json*, *xml* and *yaml*.  The default value is *xml*. ")] = None,
        penalty: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="**The penalty applied to each character that is part of a word, number sequence, alphabet sequence, etc.**  The penalty is a float number in the range [0, 1]. Full penalty, 0; no penalty, 1.  The character used as decimal separator is always '&#46;'. Hence, a parameter value like *0,33* would be illegal.  The default value is *0.25*. ")] = None,
        req_id: Annotated[Optional[StrictStr], Field(description="**An identifier for this request.**  The request identifier is a string that must match the regular expression */(?i)^[a-z0-9]{8,16}$/*.  This identifier is echoed in the returned response. Its value has no effect on the password analysis.  If this parameter is unset, a randomly generated identifier will be automatically assigned to this request. ")] = None,
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
        """The entropy calculator - alias ec -, analyzes a password and calculates its entropy.  Entropy calculator requests are billed. 


        :param password: **The password to be analyzed.**  Minimum length is 4 characters; maximum length is 128 characters.  Beware that certain characters like '&#35;', '&#61;' or '&#63;' must be properly encoded.  For more information about this issue, please refer to RFC 3986 (\"*Uniform Resource Identifier (URI): Generic Syntax*\"), sections 2.1, 2.2 and 2.4.  (required)
        :type password: str
        :param output_format: **The format of the returned analysis.**  Allowed values are *json*, *xml* and *yaml*.  The default value is *xml*. 
        :type output_format: str
        :param penalty: **The penalty applied to each character that is part of a word, number sequence, alphabet sequence, etc.**  The penalty is a float number in the range [0, 1]. Full penalty, 0; no penalty, 1.  The character used as decimal separator is always '&#46;'. Hence, a parameter value like *0,33* would be illegal.  The default value is *0.25*. 
        :type penalty: float
        :param req_id: **An identifier for this request.**  The request identifier is a string that must match the regular expression */(?i)^[a-z0-9]{8,16}$/*.  This identifier is echoed in the returned response. Its value has no effect on the password analysis.  If this parameter is unset, a randomly generated identifier will be automatically assigned to this request. 
        :type req_id: str
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

        _param = self._ec_get_serialize(
            password=password,
            output_format=output_format,
            penalty=penalty,
            req_id=req_id,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': "Ec",
            '400': None,
            '405': None,
            '500': None,
        }
        response_data = self.api_client.call_api(
            *_param,
            _request_timeout=_request_timeout
        )
        return response_data.response


    def _ec_get_serialize(
        self,
        password,
        output_format,
        penalty,
        req_id,
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
        # process the query parameters
        if password is not None:
            
            _query_params.append(('password', password))
            
        if output_format is not None:
            
            _query_params.append(('outputFormat', output_format))
            
        if penalty is not None:
            
            _query_params.append(('penalty', penalty))
            
        if req_id is not None:
            
            _query_params.append(('reqId', req_id))
            
        # process the header parameters
        # process the form parameters
        # process the body parameter


        # set the HTTP header `Accept`
        if 'Accept' not in _header_params:
            _header_params['Accept'] = self.api_client.select_header_accept(
                [
                    'application/json', 
                    'application/x-yaml', 
                    'application/xml'
                ]
            )


        # authentication setting
        _auth_settings: List[str] = [
        ]

        return self.api_client.param_serialize(
            method='GET',
            resource_path='/ec',
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


