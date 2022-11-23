# coding: utf-8

"""
    SiriKit Cloud Media

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class AddMediaIntentResponseCode(str, Enum):
    """
    AddMediaIntentResponseCode
    """

    """
    allowed enum values
    """
    UNSPECIFIED = 'unspecified'
    READY = 'ready'
    INPROGRESS = 'inProgress'
    SUCCESS = 'success'
    FAILURE = 'failure'
    FAILUREREQUIRINGAPPLAUNCH = 'failureRequiringAppLaunch'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of AddMediaIntentResponseCode from a JSON string"""
        return cls(json.loads(json_str))


