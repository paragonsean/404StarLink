# coding: utf-8

"""
    Amazon Pinpoint

    Doc Engage API - Amazon Pinpoint API

    The version of the OpenAPI document: 2016-12-01
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class EndpointTypesElement(str, Enum):
    """
    EndpointTypesElement
    """

    """
    allowed enum values
    """
    PUSH = 'PUSH'
    GCM = 'GCM'
    APNS = 'APNS'
    APNS_SANDBOX = 'APNS_SANDBOX'
    APNS_VOIP = 'APNS_VOIP'
    APNS_VOIP_SANDBOX = 'APNS_VOIP_SANDBOX'
    ADM = 'ADM'
    SMS = 'SMS'
    VOICE = 'VOICE'
    EMAIL = 'EMAIL'
    BAIDU = 'BAIDU'
    CUSTOM = 'CUSTOM'
    IN_APP = 'IN_APP'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of EndpointTypesElement from a JSON string"""
        return cls(json.loads(json_str))


