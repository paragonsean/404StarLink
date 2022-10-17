# coding: utf-8

"""
    AWS Elemental MediaConvert

    AWS Elemental MediaConvert

    The version of the OpenAPI document: 2017-08-29
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class JobTemplateListBy(str, Enum):
    """
    Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
    """

    """
    allowed enum values
    """
    NAME = 'NAME'
    CREATION_DATE = 'CREATION_DATE'
    SYSTEM = 'SYSTEM'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of JobTemplateListBy from a JSON string"""
        return cls(json.loads(json_str))


