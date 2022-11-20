# coding: utf-8

"""
    Amazon Textract

    Amazon Textract detects and analyzes text in documents and converts it into machine-readable text. This is the API reference documentation for Amazon Textract.

    The version of the OpenAPI document: 2018-06-27
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class RelationshipType(str, Enum):
    """
    RelationshipType
    """

    """
    allowed enum values
    """
    VALUE = 'VALUE'
    CHILD = 'CHILD'
    COMPLEX_FEATURES = 'COMPLEX_FEATURES'
    MERGED_CELL = 'MERGED_CELL'
    TITLE = 'TITLE'
    ANSWER = 'ANSWER'
    TABLE = 'TABLE'
    TABLE_TITLE = 'TABLE_TITLE'
    TABLE_FOOTER = 'TABLE_FOOTER'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of RelationshipType from a JSON string"""
        return cls(json.loads(json_str))


