import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listPredicted(query) {
  return request({
    url: '/system/predicted/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getPredicted(predictedId) {
  return request({
    url: '/system/predicted/' + predictedId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addPredicted(data) {
  return request({
    url: '/system/predicted',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updatePredicted(data) {
  return request({
    url: '/system/predicted',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delPredicted(predictedId) {
  return request({
    url: '/system/predicted/' + predictedId,
    method: 'delete'
  })
}

//条件查询
export function selectPredictedList(query) {
  return request({
    url: '/system/predicted/selectlist',
    method: 'get',
    params: query
  })
}

//列表排序
export function sortListPredicted(query) {
  return request({
    url: '/system/predicted/sortlist',
    method: 'get',
    params: query
  })
}

export function mhselectListPredicted(condition) {
  return request({
    url: '/system/predicted/mhselect/' + condition ,
    method: 'get',
  })
}
